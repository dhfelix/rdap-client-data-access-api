package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.object.WalletUser;

public interface WalletUserDAO {

	/**
	 * Retrieves a {@link WalletUser} by its <code>username</code>.
	 * 
	 * @param username
	 *            The username to find
	 * @return {@link WalletUser} that match with the <code>username</code>
	 *         otherwise <code>null</code>
	 */
	WalletUser getByUsername(String username) throws DataAccessException;

	/**
	 * Store the incoming object.
	 * 
	 * @param walletUser
	 *            The object to be stored.
	 * @return The object id of the stored object.
	 */
	long store(WalletUser walletUser) throws DataAccessException;

	/**
	 * Updates the <code>WalletUser</code> object.
	 * 
	 * @param walletUser
	 *            The object to be updated.
	 */
	void update(WalletUser walletUser) throws DataAccessException;

	/**
	 * Checks if the <code>username</code> exists.
	 * 
	 * @param username
	 *            The username to find.
	 * @return <code>true</code> if exists an object with the username
	 *         <code>username</code>, otherwise, <code>false</code>
	 */
	boolean existByUsername(String username) throws DataAccessException;

	/**
	 * Remove the incoming object.
	 * 
	 * @param walletUser
	 *            The object to be removed.
	 */
	void delete(WalletUser walletUser) throws DataAccessException;

}
