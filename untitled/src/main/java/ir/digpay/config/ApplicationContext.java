package ir.digpay.config;

import ir.digpay.entity.Passenger;
import ir.digpay.repository.Base.PassengerRepository;
import ir.digpay.repository.Base.PassengerRepositoryImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ApplicationContext {

    private static ApplicationContext applicationContext;

    private ApplicationContext() {
    }

    public static ApplicationContext getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = new ApplicationContext();
        }
        return applicationContext;
    }

    private Connection connection;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        ApplicationProperties.JDBC_URL,
                        ApplicationProperties.JDBC_USER,
                        ApplicationProperties.JDBC_PASSWORD
                );
            } catch (SQLException s) {
                throw new RuntimeException(s);
            }
        }
        return connection;
    }

    private PassengerRepository passengerRepository;

    public PassengerRepository getPassengerRepository() {
        if (passengerRepository == null) {
            passengerRepository = new PassengerRepositoryImp(getConnection());
        }
        return passengerRepository;
    }
}
