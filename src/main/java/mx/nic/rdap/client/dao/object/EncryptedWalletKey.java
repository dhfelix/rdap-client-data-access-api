package mx.nic.rdap.client.dao.object;

public class EncryptedWalletKey {

	private Long id;

	private Long userId;

	private String encryptedWalletKey;

	private String walletKeyAlgorithm;

	public EncryptedWalletKey() {
		// no code;
	}

	public EncryptedWalletKey(Long id, Long userId, String encryptedWalletKey, String walletKeyAlgorithm) {
		super();
		this.id = id;
		this.userId = userId;
		this.encryptedWalletKey = encryptedWalletKey;
		this.walletKeyAlgorithm = walletKeyAlgorithm;
	}

	@Override
	public String toString() {
		return "EncryptedWalletKey [id=" + id + ", userId=" + userId + ", encryptedWalletKey=" + encryptedWalletKey
				+ ", walletKeyAlgorithm=" + walletKeyAlgorithm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((encryptedWalletKey == null) ? 0 : encryptedWalletKey.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((walletKeyAlgorithm == null) ? 0 : walletKeyAlgorithm.hashCode());
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
		if (!(obj instanceof EncryptedWalletKey)) {
			return false;
		}
		EncryptedWalletKey other = (EncryptedWalletKey) obj;
		if (encryptedWalletKey == null) {
			if (other.encryptedWalletKey != null) {
				return false;
			}
		} else if (!encryptedWalletKey.equals(other.encryptedWalletKey)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		if (walletKeyAlgorithm == null) {
			if (other.walletKeyAlgorithm != null) {
				return false;
			}
		} else if (!walletKeyAlgorithm.equals(other.walletKeyAlgorithm)) {
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

	public String getEncryptedWalletKey() {
		return encryptedWalletKey;
	}

	public void setEncryptedWalletKey(String encryptedWalletKey) {
		this.encryptedWalletKey = encryptedWalletKey;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getWalletKeyAlgorithm() {
		return walletKeyAlgorithm;
	}

	public void setWalletKeyAlgorithm(String walletKeyAlgorithm) {
		this.walletKeyAlgorithm = walletKeyAlgorithm;
	}

}
