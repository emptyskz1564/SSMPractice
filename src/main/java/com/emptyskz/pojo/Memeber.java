package com.emptyskz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memeber {
    private Integer id;
    private String name;
    private String nickName;
    private String phoneNumber;
    private String email;
}
