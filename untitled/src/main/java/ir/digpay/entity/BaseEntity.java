package ir.digpay.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BaseEntity {
    public static int idx = 1;
    private int id;

    public BaseEntity(){
        this.id = idx++;
    }
}
