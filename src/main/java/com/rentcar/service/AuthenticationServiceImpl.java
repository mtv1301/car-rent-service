package com.rentcar.service;

import com.rentcar.dao.DriverDao;
import com.rentcar.exception.AuthenticationException;
import com.rentcar.lib.Inject;
import com.rentcar.lib.Service;
import com.rentcar.model.Driver;
import java.util.Optional;

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
