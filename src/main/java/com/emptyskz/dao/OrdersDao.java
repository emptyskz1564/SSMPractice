package com.emptyskz.dao;

import com.emptyskz.pojo.Memeber;
import com.emptyskz.pojo.Orders;
import com.emptyskz.pojo.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao {
    //查询所有的订单
    @Select("select * from orders")
    @Results({
            @Result(id = true ,property = "id", column = "id"),
            @Result(property = "orderNumber" , column = "orderNumber"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "peyType", column = "peyType"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "product", column = "productId", javaType = Product.class,one = @One(select = "com.emptyskz.dao.ProductDao.findById"))
    })
    public List<Orders> findAll();

    //通过Id查订单
    @Select("select * from orders where id=#{id}")
    @Results({
            @Result(id = true ,property = "id", column = "id"),
            @Result(property = "orderNumber" , column = "orderNumber"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "peyType", column = "peyType"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "product", column = "productId", javaType = Product.class,one = @One(select = "com.emptyskz.dao.ProductDao.findById")),
            @Result(property = "memeber", column = "memeberId", javaType = Memeber.class, one = @One(select = "com.emptyskz.dao.MemeberDao.findById")),
            @Result(property = "travellerList", column = "id", javaType = List.class, many = @Many(select = "com.emptyskz.dao.TravellerDao.findByOrderId"))
    })
    Orders findById(int id);
}
