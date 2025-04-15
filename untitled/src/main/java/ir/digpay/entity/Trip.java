package ir.digpay.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trip extends BaseEntity {
    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double distance;
    private final double speed = 70;
    private int pricePerUnit;
    private double totalPrice;
    private Driver driver;
    private Passenger passenger;

    public Trip(int xStart, int yStart, int xEnd, int yEnd, int pricePerUnit, Driver driver, Passenger passenger) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.pricePerUnit = pricePerUnit;
        this.distance = Math.sqrt(Math.pow(xEnd - xStart, 2) + Math.pow(yEnd - yStart, 2));
        this.totalPrice = this.distance * this.pricePerUnit;
        this.startTime = LocalDateTime.now();
//        this.endTime = (distance/speed) + (startTime.getHour()*60 + startTime.getMinute());
//        this.endTime = startTime.plusMinutes(Double.valueOf(distance / speed).longValue());
        this.endTime = startTime.plusMinutes(Math.round(distance/speed));
        this.driver = driver;
        this.passenger = passenger;
    }

}
