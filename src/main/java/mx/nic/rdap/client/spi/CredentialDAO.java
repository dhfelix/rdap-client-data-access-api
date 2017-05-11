package mx.nic.rdap.client.spi;

import java.util.List;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.object.EncryptedCredential;

public interface CredentialDAO {

	public List<EncryptedCredential> getCredentialsForRdapServer(long userId, String serverId)
			throws DataAccessException;

	public List<EncryptedCredential> getCredentials(long userId) throws DataAccessException;

	public long storeCredential(EncryptedCredential encryptedCredential) throws DataAccessException;

	public int updateCredential(EncryptedCredential encryptedCredential) throws DataAccessException;

	public void deleteCredential(long userId, long credentialId) throws DataAccessException;

}
