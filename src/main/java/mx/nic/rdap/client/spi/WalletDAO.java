package mx.nic.rdap.client.spi;

import java.util.List;

import mx.nic.rdap.client.credential.UserEncryptedCredential;
import mx.nic.rdap.client.dao.exception.DataAccessException;

public interface WalletDAO {

	public List<UserEncryptedCredential> getUserCredentialForRdapServer(long userId, String serverId)
			throws DataAccessException;

	public List<UserEncryptedCredential> getUserCredentials(long userId) throws DataAccessException;

	public long storeUserCredential(UserEncryptedCredential userServerCredential) throws DataAccessException;

	public int updateUserCredential(UserEncryptedCredential userServerCredential) throws DataAccessException;

	public void deleteUserCredential(long userId, long loginId) throws DataAccessException;

}
