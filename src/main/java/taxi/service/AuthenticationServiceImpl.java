package taxi.service;

import java.util.Optional;
import taxi.dao.DriverDao;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String driverLogin, String driverPassword) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(driverLogin);
        if (driver.isEmpty()) {
            throw new AuthenticationException("Driver or password are incorrect!");
        }
        if (driver.get().getPassword().equals(driverPassword)) {
            return driver.get();
        }
        throw new AuthenticationException("Driver or password are incorrect!");
    }
}
