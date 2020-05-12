package com.emptyskz.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String productNum;
    private String productName;
    private String cityName;
    @Nullable
    private Date departureTime;
    private Float productPrice;
    private String productDesc;
    private Boolean productStatus;
}
