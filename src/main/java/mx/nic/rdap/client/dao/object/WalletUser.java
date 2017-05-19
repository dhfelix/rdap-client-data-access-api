package mx.nic.rdap.client.dao.object;

public class WalletUser {
	private Long id;

	private String username;

	private String hashedPassword;

	private String hashAlgorithm;

	private String salt;

	private Integer iterations;

	private String pbeAlgorithm;

	private String encryptedWalletKey;

	private String keyAlgorithm;

	private Integer keySize;

	private String cipherAlgorithm;

	public WalletUser() {
		// no code
	}

	public WalletUser(Long id, String username, String hashedPassword, String hashAlgorithm, String salt,
			Integer iterations, String pbeAlgorithm, String encryptedWalletKey, String keyAlgorithm, Integer keySize,
			String cipherAlgorithm) {
		super();
		this.id = id;
		this.username = username;
		this.hashedPassword = hashedPassword;
		this.hashAlgorithm = hashAlgorithm;
		this.salt = salt;
		this.iterations = iterations;
		this.pbeAlgorithm = pbeAlgorithm;
		this.encryptedWalletKey = encryptedWalletKey;
		this.keyAlgorithm = keyAlgorithm;
		this.keySize = keySize;
		this.cipherAlgorithm = cipherAlgorithm;
	}

	@Override
	public String toString() {
		return "WalletUser [id=" + id + ", username=" + username + ", hashedPassword=" + hashedPassword
				+ ", hashAlgorithm=" + hashAlgorithm + ", salt=" + salt + ", iterations=" + iterations
				+ ", pbeAlgorithm=" + pbeAlgorithm + ", encryptedWalletKey=" + encryptedWalletKey + ", keyAlgorithm="
				+ keyAlgorithm + ", keySize=" + keySize + ", cipherAlgorithm=" + cipherAlgorithm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cipherAlgorithm == null) ? 0 : cipherAlgorithm.hashCode());
		result = prime * result + ((encryptedWalletKey == null) ? 0 : encryptedWalletKey.hashCode());
		result = prime * result + ((hashAlgorithm == null) ? 0 : hashAlgorithm.hashCode());
		result = prime * result + ((hashedPassword == null) ? 0 : hashedPassword.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iterations == null) ? 0 : iterations.hashCode());
		result = prime * result + ((keyAlgorithm == null) ? 0 : keyAlgorithm.hashCode());
		result = prime * result + ((keySize == null) ? 0 : keySize.hashCode());
		result = prime * result + ((pbeAlgorithm == null) ? 0 : pbeAlgorithm.hashCode());
		result = prime * result + ((salt == null) ? 0 : salt.hashCode());
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
		if (!(obj instanceof WalletUser)) {
			return false;
		}
		WalletUser other = (WalletUser) obj;
		if (cipherAlgorithm == null) {
			if (other.cipherAlgorithm != null) {
				return false;
			}
		} else if (!cipherAlgorithm.equals(other.cipherAlgorithm)) {
			return false;
		}
		if (encryptedWalletKey == null) {
			if (other.encryptedWalletKey != null) {
				return false;
			}
		} else if (!encryptedWalletKey.equals(other.encryptedWalletKey)) {
			return false;
		}
		if (hashAlgorithm == null) {
			if (other.hashAlgorithm != null) {
				return false;
			}
		} else if (!hashAlgorithm.equals(other.hashAlgorithm)) {
			return false;
		}
		if (hashedPassword == null) {
			if (other.hashedPassword != null) {
				return false;
			}
		} else if (!hashedPassword.equals(other.hashedPassword)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (iterations == null) {
			if (other.iterations != null) {
				return false;
			}
		} else if (!iterations.equals(other.iterations)) {
			return false;
		}
		if (keyAlgorithm == null) {
			if (other.keyAlgorithm != null) {
				return false;
			}
		} else if (!keyAlgorithm.equals(other.keyAlgorithm)) {
			return false;
		}
		if (keySize == null) {
			if (other.keySize != null) {
				return false;
			}
		} else if (!keySize.equals(other.keySize)) {
			return false;
		}
		if (pbeAlgorithm == null) {
			if (other.pbeAlgorithm != null) {
				return false;
			}
		} else if (!pbeAlgorithm.equals(other.pbeAlgorithm)) {
			return false;
		}
		if (salt == null) {
			if (other.salt != null) {
				return false;
			}
		} else if (!salt.equals(other.salt)) {
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

	public String getHashAlgorithm() {
		return hashAlgorithm;
	}

	public void setHashAlgorithm(String hashAlgorithm) {
		this.hashAlgorithm = hashAlgorithm;
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

	public String getPbeAlgorithm() {
		return pbeAlgorithm;
	}

	public void setPbeAlgorithm(String pbeAlgorithm) {
		this.pbeAlgorithm = pbeAlgorithm;
	}

	public String getEncryptedWalletKey() {
		return encryptedWalletKey;
	}

	public void setEncryptedWalletKey(String encryptedWalletKey) {
		this.encryptedWalletKey = encryptedWalletKey;
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

	public String getCipherAlgorithm() {
		return cipherAlgorithm;
	}

	public void setCipherAlgorithm(String cipherAlgorithm) {
		this.cipherAlgorithm = cipherAlgorithm;
	}

}
