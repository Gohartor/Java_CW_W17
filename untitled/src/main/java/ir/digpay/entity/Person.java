package ir.digpay.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public abstract class Person extends BaseEntity {
    private String name;
    private String phoneNumber;
    private String userName;
    private String password;
    private int x;
    private int y;

    public Person(String name, String phoneNumber, String userName, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
    }

}
