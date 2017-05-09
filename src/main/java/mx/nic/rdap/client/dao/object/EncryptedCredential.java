package mx.nic.rdap.client.dao.object;

public class EncryptedCredential {

	private Long id;
	private Long userId;
	private String username;
	private String encryptedPassword;
	private String rdapServerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getRdapServerId() {
		return rdapServerId;
	}

	public void setRdapServerId(String rdapServerId) {
		this.rdapServerId = rdapServerId;
	}
}
