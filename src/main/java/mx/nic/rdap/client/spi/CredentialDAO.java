package mx.nic.rdap.client.spi;

import java.util.List;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.object.EncryptedCredential;

public interface CredentialDAO {

	/**
	 * Retrieves a {@link EncryptedCredential} by an userId and a serverId
	 * 
	 * @param userId
	 *            The <code>userId</code> owner of the credential
	 * @param serverId
	 *            <code>serverId</code> that requieres the credential
	 * @return <code>null</code> if not exist, otherwise the credential of the
	 *         <code>userId</code> for the server <code>serverId</code>
	 */
	public EncryptedCredential getCredentialForRdapServer(long userId, String serverId) throws DataAccessException;

	/**
	 * Gets all the credentials for the user <code>userId</code>
	 * 
	 * @param userId
	 *            User <code>userId</code> that requires all the credentials.
	 * @return A {@link List} with all the stored credentials for the user
	 *         <code>userId</code>, if the user doesn't have credentials,
	 *         returns an empty {@link List} or <code>null</code>.
	 */
	public List<EncryptedCredential> getCredentials(long userId) throws DataAccessException;

	/**
	 * Store the encryptedCredential.
	 * 
	 * @param encryptedCredential
	 *            The object to be stored.
	 * @return The id of the stored object.
	 */
	public long storeCredential(EncryptedCredential encryptedCredential) throws DataAccessException;

	/**
	 * Updates the incoming object.
	 * 
	 * @param encryptedCredential
	 *            The object to be updated
	 */
	public void updateCredential(EncryptedCredential encryptedCredential) throws DataAccessException;

	/**
	 * Removes a credential.
	 * 
	 * @param userId
	 *            <code>userId</code> of the owner credential.
	 * @param credentialId
	 *            id of the {@link EncryptedCredential} to be removed.
	 */
	public void deleteCredential(long userId, long credentialId) throws DataAccessException;

	/**
	 * Checks if the user <code>userId</code> has a credential for the server
	 * <code>serverId</code>
	 * 
	 * @param userId
	 *            The owner of the credential.
	 * @param serverId
	 *            The id of the server.
	 * @return true if the user <code>userId</code> has a credential, otherwise,
	 *         false
	 */
	public boolean existCredential(long userId, String serverId) throws DataAccessException;

}
