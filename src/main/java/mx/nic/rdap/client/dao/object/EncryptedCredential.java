package mx.nic.rdap.client.dao.object;

public class EncryptedCredential {

	private Long id;
	private Long userId;
	private String username;
	private String encryptedPassword;
	private String rdapServerId;

	@Override
	public String toString() {
		return "EncryptedCredential [id=" + id + ", userId=" + userId + ", username=" + username
				+ ", encryptedPassword=" + encryptedPassword + ", rdapServerId=" + rdapServerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((encryptedPassword == null) ? 0 : encryptedPassword.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rdapServerId == null) ? 0 : rdapServerId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EncryptedCredential)) {
			return false;
		}
		EncryptedCredential other = (EncryptedCredential) obj;
		if (encryptedPassword == null) {
			if (other.encryptedPassword != null) {
				return false;
			}
		} else if (!encryptedPassword.equals(other.encryptedPassword)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (rdapServerId == null) {
			if (other.rdapServerId != null) {
				return false;
			}
		} else if (!rdapServerId.equals(other.rdapServerId)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

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
