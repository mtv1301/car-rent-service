package com.rentcar.controller.driver;

import com.rentcar.lib.Injector;
import com.rentcar.service.DriverService;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("com.rentcar");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        driverService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/drivers/all");
    }
}
