package ir.digpay.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Passenger extends Person {


    public Passenger(String name, String phoneNumber, String userName, String password) {
        super(name, phoneNumber, userName, password);
    }

}
