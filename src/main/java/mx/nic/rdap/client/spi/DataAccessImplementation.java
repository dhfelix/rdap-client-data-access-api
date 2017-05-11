package mx.nic.rdap.client.spi;

import java.util.Properties;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.exception.InitializationException;
import mx.nic.rdap.client.service.DataAccessService;

/**
 * The interface of the main/central class of the implementation.
 * <p>
 * It's mainly just a hub that references the several implementation classes
 * that actually take care of the data access.
 */
public interface DataAccessImplementation {
	/**
	 * Can be used by the implementation to initialize itself.
	 * <p>
	 * Users of this library are not supposed to call this method. Call
	 * {@link DataAccessService#initialize(Properties)} instead.
	 * 
	 * @param properties
	 *            User-supplied configuration. The implementation defines the
	 *            properties that should be present here, according to its
	 *            needs.
	 */
	public void init(Properties properties) throws InitializationException;

	/**
	 * Returns an instance of the implementation class that retrieves User data
	 * from whatever source the implementation is wrapping.
	 */
	public UserDAO getUserDAO() throws DataAccessException;

	/**
	 * Returns an instance of the implementation class that retrieves Credential
	 * data from whatever source the implementation is wrapping.
	 */
	public CredentialDAO getCredentialDAO() throws DataAccessException;

	/**
	 * Returns an instance of the implementation class that retrieves Wallet Key
	 * data from whatever source the implementation is wrapping.
	 */
	public WalletKeyDAO getWalletKeyDAO() throws DataAccessException;

}
