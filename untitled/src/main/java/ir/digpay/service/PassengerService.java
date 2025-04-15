package ir.digpay.service;
import ir.digpay.entity.Driver;
import ir.digpay.entity.Trip;

public class PassengerService {

    public Trip requestNewTrip(int xStart, int yStart, int xEnd, int yEnd) {
//        Trip trip = new Trip(xStart, yStart, xEnd, yEnd, 10);
        return null;
    }

    public void getDriverDetails(Driver driver) {
        System.out.println(driver.getName());
    }

}
