package mx.nic.rdap.client.credential;

public class UserCredential {

	private Long id;

	private String username;

	private String hashedPassword;

	private String salt;

	private String encryptedWalletKey;

	public UserCredential() {
		// no code;
	}

	// getters and setters

	public Long getId() {
		return id;
	}

	public String getEncryptedWalletKey() {
		return encryptedWalletKey;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public String getUsername() {
		return username;
	}

	public String getSalt() {
		return salt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEncryptedWalletKey(String encryptedWalletKey) {
		this.encryptedWalletKey = encryptedWalletKey;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
