package com.emptyskz.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class users {
    private Integer id;
    private String email;
    private String userName;
    private String password;
    private String phoneNumber;
    private Integer status;
}
