package mx.nic.rdap.client.credential;

public class RDAPLogin {

	private Long id;
	private Long userId;
	private String username;
	private String encryptedPassword;
	private String rdapServerDomain;

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

	public String getRdapServerDomain() {
		return rdapServerDomain;
	}

	public void setRdapServerDomain(String rdapServerDomain) {
		this.rdapServerDomain = rdapServerDomain;
	}

}
