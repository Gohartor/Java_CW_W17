package ir.digpay.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Driver extends Person {
    private String carName;
    private String plate;


    public Driver(String name, String phoneNumber,
                  String carName,
                  String plate, String userName, String password) {
        super(name, phoneNumber, userName, password);
        this.carName = carName;
        this.plate = plate;
    }

}
