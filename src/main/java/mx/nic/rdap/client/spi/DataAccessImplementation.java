package mx.nic.rdap.client.spi;

import java.util.Properties;

import mx.nic.rdap.client.dao.exception.DataAccessException;
import mx.nic.rdap.client.dao.exception.InitializationException;

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
	 * Returns an instance of the implementation class that retrieves Autonomous
	 * System Number data from whatever source the implementation is wrapping.
	 * <p>
	 * Not all implementations are expected to provide ASN data. In such cases,
	 * this function is expected to either return <code>null</code> or throw a
	 * {@link NotImplementedException}.
	 */
	public UserDAO getUserDAO() throws DataAccessException;

	/**
	 * Returns an instance of the implementation class that retrieves Autonomous
	 * System Number data from whatever source the implementation is wrapping.
	 * <p>
	 * Not all implementations are expected to provide ASN data. In such cases,
	 * this function is expected to either return <code>null</code> or throw a
	 * {@link NotImplementedException}.
	 */
	public WalletDAO getWalletDAO() throws DataAccessException;

}
