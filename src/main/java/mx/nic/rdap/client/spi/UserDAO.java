package mx.nic.rdap.client.spi;

import mx.nic.rdap.client.credential.UserCredential;
import mx.nic.rdap.client.dao.exception.DataAccessException;

public interface UserDAO {

	public UserCredential getUserCredential(String username) throws DataAccessException;

	public long storeUserCredential(UserCredential userCredential) throws DataAccessException;

	public void updateUserCredential(UserCredential userCredential) throws DataAccessException;
}
