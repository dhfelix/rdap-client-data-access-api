package mx.nic.rdap.client.credential;

public class UserEncryptedWalletKey {

	private Long userId;

	private String encryptedWalletKey;

	private String walletKeyAlgorithm;

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
