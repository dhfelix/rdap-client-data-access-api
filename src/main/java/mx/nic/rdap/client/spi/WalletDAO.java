package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.credential.RDAPLogin;
import mx.nic.rdap.client.dao.exception.DataAccessException;

public interface WalletDAO {

	public RDAPLogin getLogin(long userId, String serverDomain) throws DataAccessException;

	public long storeLogin(RDAPLogin userServerCredential) throws DataAccessException;

	public void updateLogin(RDAPLogin userServerCredential) throws DataAccessException;

}
