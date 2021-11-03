## **Taxi Service Application**

###**General info**

This project is a simple realization of "taxi service" system. User can sign up as a driver. Driver can see and manage information about available cars.
The project is N-tier application with:

* DAO layer for interaction with DB.
* Service layer with business logic.
* Controller level for handling HTTP requests.
* Presentation level for user interaction with the application.

###**Features provided by the application for registered users**

1. Login. If wrong credentials provided, error message will be shown.
2. Create new car, driver, manufacturer.
3. Show list of all cars with information about each car and list of drivers assigned to the car.
4. Delete any car from the list. All drivers will be unassigned from deleted car.
5. Create new driver.
6. Add driver to car.
7. Show list of all registered drivers with information about each driver.
8. Delete any driver from the list. Driver will be unassigned from previously assigned cars.
9. Create new car manufacturer.
10. Show list of all car's manufacturers with information about each manufacturer.
11. Delete any manufacturer from the list.

###**Technologies**

In project these technologies have been used:
* Java 11
* MySQL
* Tomcat 9.0.54
* Javax servlet API
* JSTL
* JDBC

###**Setup**

There are few steps to deploy this project:

1. Install MySQL
2. Install <a href="https://tomcat.apache.org/download-90.cgi">Apache Tomcat 9.0.54</a> version.
3. Fork this project to your repository
4. Clone it using one of the "Code" options, which is more suitable for you
5. In resources directory you can find init_db.sql file. Use it to initialize you database
6. Add some data to DB
7. Go to the ConnectionUtil class located in src/main/java/mate/util and add your url to DB, login, password and JDBC driver there.
8. Configure your Tomcat. (P.S. Your application context needs to be as "/")
9. Run this project using Tomcat's local server# taxi-service-project
