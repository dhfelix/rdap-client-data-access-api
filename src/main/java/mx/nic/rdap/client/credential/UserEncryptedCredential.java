package mx.nic.rdap.client.credential;

public class UserEncryptedCredential {

	private Long id;
	private Long clientUserId;
	private String username;
	private String encryptedPassword;
	private String rdapServerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClientUserId() {
		return clientUserId;
	}

	public void setClientUserId(Long clientUserId) {
		this.clientUserId = clientUserId;
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
