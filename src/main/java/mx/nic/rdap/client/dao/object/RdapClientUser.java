package mx.nic.rdap.client.dao.object;

public class RdapClientUser {

	private Long id;

	private String username;

	private String hashedPassword;

	private String salt;

	private int iterations;

	private String hashAlgorithm;

	private String keyAlgorithm;

	private int keySize;

	private String pbeAlgorith;

	public RdapClientUser() {
		// no code;
	}

	// getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getIterations() {
		return iterations;
	}

	public void setIterations(int iterations) {
		this.iterations = iterations;
	}

	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	public void setHashAlgorithm(String hashAlgorithm) {
		this.hashAlgorithm = hashAlgorithm;
	}

	public String getKeyAlgorithm() {
		return keyAlgorithm;
	}

	public void setKeyAlgorithm(String keyAlgorithm) {
		this.keyAlgorithm = keyAlgorithm;
	}

	public int getKeySize() {
		return keySize;
	}

	public void setKeySize(int keySize) {
		this.keySize = keySize;
	}

	public String getPbeAlgorith() {
		return pbeAlgorith;
	}

	public void setPbeAlgorith(String pbeAlgorith) {
		this.pbeAlgorith = pbeAlgorith;
	}

}
