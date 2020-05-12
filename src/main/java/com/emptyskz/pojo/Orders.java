package com.emptyskz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer id;
    private String orderNumber;
    private String orderTime;
    private Integer peopleCount;
    private String orderDesc;
    private int payType;
    private int orderStatus;
    private int productId;
    private int memeberId;
    private Product product;
    private List<Traveller> travellerList;
    private Memeber memeber;
}
