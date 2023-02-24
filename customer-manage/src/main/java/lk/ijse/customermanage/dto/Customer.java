package lk.ijse.customermanage.dto;

/*
    @author DanujaV
    @created 2/25/23 - 12:41 AM   
*/

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer implements Serializable {
    private Integer id;
    private String name;
    private String address;
    private Double salary;
}
