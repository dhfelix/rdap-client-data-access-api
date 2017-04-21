package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.credential.RdapClientUser;
import mx.nic.rdap.client.credential.UserEncryptedWalletKey;
import mx.nic.rdap.client.dao.exception.DataAccessException;

public interface UserDAO {

	public RdapClientUser getUserCredential(String username) throws DataAccessException;

	public long storeUserCredential(RdapClientUser userCredential) throws DataAccessException;

	public void updateUserCredential(RdapClientUser userCredential) throws DataAccessException;

	public UserEncryptedWalletKey getUserWalletKey(long userId) throws DataAccessException;

	public void storeUserWalletKey(UserEncryptedWalletKey userWalletKey) throws DataAccessException;

	public void updateUserWalletKey(UserEncryptedWalletKey userWalletKey) throws DataAccessException;
}
