package com.rentcar.service;

import com.rentcar.exception.AuthenticationException;
import com.rentcar.model.Driver;

public interface AuthenticationService {
    Driver login(String driverLogin, String driverPassword) throws AuthenticationException;
}
