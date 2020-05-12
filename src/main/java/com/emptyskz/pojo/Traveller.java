package com.emptyskz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traveller {
    private Integer id;
    private String name;
    private Boolean sex;
    private String phoneNumber;
    private String email;
    private Integer credentialsType;
    private String credentialsNumber;
    private Integer travellerType;
}
