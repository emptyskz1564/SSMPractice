package com.emptyskz.service.Impl;

import com.emptyskz.dao.OrdersDao;
import com.emptyskz.pojo.Orders;
import com.emptyskz.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServcieImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;


//    public List<Orders> findAll(int page ,int size ) {
//        PageHelper.startPage(page,size);
//        return ordersDao.findAll();
//    }
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    public Orders findById(int id) {
        return ordersDao.findById(id);
    }
}
