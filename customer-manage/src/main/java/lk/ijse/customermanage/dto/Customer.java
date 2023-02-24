package lk.ijse.customermanage.dto;

/*
    @author DanujaV
    @created 2/25/23 - 12:41 AM   
*/

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    private Integer id;
    private String name;
    private String address;
    private Double salary;
}
