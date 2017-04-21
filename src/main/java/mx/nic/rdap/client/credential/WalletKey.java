package mx.nic.rdap.client.credential;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class WalletKey {

	// TODO: make this a property variable
	private static String cipherAlgorithm = "AES";

	private SecretKey userKey;

	public WalletKey(String encriptedKey, SecretKey passwordBaseKey) throws NoSuchAlgorithmException,
			NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
		Cipher cipher = Cipher.getInstance(cipherAlgorithm);

		cipher.init(Cipher.DECRYPT_MODE, passwordBaseKey);
		byte[] decryptKey = cipher.doFinal(Base64.getDecoder().decode(encriptedKey));
		userKey = new SecretKeySpec(decryptKey, cipherAlgorithm);
	}

	public String decryptUserCredentialPassword(String encryptedPass) throws InvalidKeyException, IllegalBlockSizeException,
			BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance(cipherAlgorithm);
		cipher.init(Cipher.DECRYPT_MODE, userKey);
		byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPass));
		return new String(decryptedBytes);
	}

	public String encryptUserCredentialPassword(String plainPass) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherAlgorithm);

		cipher.init(Cipher.ENCRYPT_MODE, userKey);
		byte[] doFinal = cipher.doFinal(plainPass.getBytes());
		return Base64.getEncoder().encodeToString(doFinal);
	}

	public String getEncryptedWalletKey(SecretKey passwordBaseKey) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherAlgorithm);
		cipher.init(Cipher.ENCRYPT_MODE, passwordBaseKey);

		byte[] encryptedBytes = cipher.doFinal(userKey.getEncoded());
		return Base64.getEncoder().encodeToString(encryptedBytes);
	}

}
