package mx.nic.rdap.client.credential;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class UserPasswordKey {

	private SecretKey secretKey;

	// TODO read this configuration from a properties file.
	public static final int KEY_SIZE = 256;
	public static final int ITERATIONS = 25;
	public static final String SECRET_KEY_ALGORITHM = "PBKDF2WithHmacSHA256";
	public static final String HASH_ALGORITHM = "SHA-256";

	public UserPasswordKey(String plainPassword, String salt, int iterations, String secretKeyAlgorithm, int keySize)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		SecretKeyFactory factory = SecretKeyFactory.getInstance(secretKeyAlgorithm);
		KeySpec spec = new PBEKeySpec(plainPassword.toCharArray(), DatatypeConverter.parseHexBinary(salt), iterations,
				keySize);
		SecretKey generateSecret = factory.generateSecret(spec);
		secretKey = new SecretKeySpec(generateSecret.getEncoded(), "AES");
	}

	public SecretKey getUserSecretKey() {
		return secretKey;
	}

	public static boolean isValidPassword(String plainPassword, String salt, int iterations, String hashAlgorithm,
			String storedPasswordHash) throws NoSuchAlgorithmException {

		String base64PasswordHash = getBase64PasswordHash(plainPassword, salt, iterations, hashAlgorithm);
		return base64PasswordHash.equals(storedPasswordHash);
	}

	public static String getBase64PasswordHash(String plainPassword, String salt, int iterations, String hashAlgorithm)
			throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(hashAlgorithm);

		byte[] saltBinary = DatatypeConverter.parseHexBinary(salt);
		md.update(saltBinary);

		byte[] hash = md.digest(plainPassword.getBytes());

		for (int i = 0; i < iterations; i++) {
			md.update(saltBinary);
			hash = md.digest(hash);
		}

		return Base64.getEncoder().encodeToString(hash);
	}
}
