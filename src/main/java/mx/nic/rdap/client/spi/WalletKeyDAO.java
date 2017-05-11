package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.object.EncryptedWalletKey;

public interface WalletKeyDAO {
	public EncryptedWalletKey getWalletKey(long userId) throws DataAccessException;

	public long storeWalletKey(EncryptedWalletKey encryptedWalletKey) throws DataAccessException;

	public void updateWalletKey(EncryptedWalletKey encryptedWalletKey) throws DataAccessException;
}
