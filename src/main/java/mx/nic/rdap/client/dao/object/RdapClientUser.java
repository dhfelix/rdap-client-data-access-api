package mx.nic.rdap.client.dao.object;

public class RdapClientUser {

	private Long id;

	private String username;

	private String hashedPassword;

	private String salt;

	private Integer iterations;

	private String hashAlgorithm;

	private String keyAlgorithm;

	private Integer keySize;

	private String pbeAlgorithm;

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

	public Integer getIterations() {
		return iterations;
	}

	public void setIterations(Integer iterations) {
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

	public Integer getKeySize() {
		return keySize;
	}

	public void setKeySize(Integer keySize) {
		this.keySize = keySize;
	}

	public String getPbeAlgorithm() {
		return pbeAlgorithm;
	}

	public void setPbeAlgorith(String pbeAlgorithm) {
		this.pbeAlgorithm = pbeAlgorithm;
	}

}
