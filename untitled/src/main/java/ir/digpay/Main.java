package ir.digpay;

import ir.digpay.config.ApplicationContext;
import ir.digpay.entity.Passenger;
import ir.digpay.repository.Base.PassengerRepository;
import ir.digpay.repository.Base.PassengerRepositoryImp;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = ApplicationContext.getApplicationContext();

        PassengerRepository passengerRepository = applicationContext.getPassengerRepository();
        Passenger passenger = new Passenger();
        passenger = passengerRepository.findById(1).orElse(null);
        System.out.println(passenger);
    }
}