package com.emptyskz.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String productNum;
    private String productName;
    private String cityName;
    private Date DepartureTime;
    private Float productPrice;
    private String productDesc;
    private Boolean productStatus;
}
