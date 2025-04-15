package ir.digpay.repository.Base;

import ir.digpay.entity.Passenger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PassengerRepositoryImp
        implements PassengerRepository {
    private Connection connection;

    public PassengerRepositoryImp(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Passenger create(Passenger passenger) {
        return null;
    }

    @Override
    public Passenger update(Passenger passenger) {
        return null;
    }

    @Override
    public List<Passenger> findAll() {

        return List.of();
    }

    @Override
    public Optional<Passenger> findById(Integer id) {
        Passenger passenger = new Passenger();
        try (PreparedStatement preparedStatement = connection.prepareStatement
                ("select * from passengers p where p.passenger_id=? ")){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                passenger.setId(resultSet.getInt("passenger_id"));
                passenger.setPassword(resultSet.getString("password"));
                passenger.setName(resultSet.getString("name"));
                passenger.setUserName(resultSet.getString("user_name"));
                passenger.setPhoneNumber(resultSet.getString("phone_number"));
                passenger.setX(resultSet.getInt("x_location"));
                passenger.setY(resultSet.getInt("y_location"));
            }
        }catch (SQLException sqlException){
            throw new RuntimeException(sqlException);
        }
        return Optional.of(passenger);
    }

    @Override
    public int deleteById(Integer integer) {
        return 0;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public long countAll() {
        return 0;
    }
}
