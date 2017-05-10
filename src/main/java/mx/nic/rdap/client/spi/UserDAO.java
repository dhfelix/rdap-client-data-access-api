package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.object.EncryptedWalletKey;
import mx.nic.rdap.client.dao.object.RdapClientUser;

public interface UserDAO {

	public RdapClientUser getUser(String username) throws DataAccessException;

	public long storeUser(RdapClientUser user) throws DataAccessException;

	public void updateUser(RdapClientUser user) throws DataAccessException;

	public boolean existUser(String username) throws DataAccessException;

	public EncryptedWalletKey getWalletKey(long userId) throws DataAccessException;

	public long storeWalletKey(EncryptedWalletKey encryptedWalletKey) throws DataAccessException;

	public void updateWalletKey(EncryptedWalletKey encryptedWalletKey) throws DataAccessException;
}
