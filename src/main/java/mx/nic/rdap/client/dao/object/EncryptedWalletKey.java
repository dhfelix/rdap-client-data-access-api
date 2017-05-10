package mx.nic.rdap.client.dao.object;

public class EncryptedWalletKey {

	private Long id;

	private Long userId;

	private String encryptedWalletKey;

	private String walletKeyAlgorithm;

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
