package com.emptyskz.service;

import com.emptyskz.pojo.Orders;

import java.util.List;

public interface OrdersService {

    //插叙所有的订单
    public List<Orders> findAll(int page,int size);

}
