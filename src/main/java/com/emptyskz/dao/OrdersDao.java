package com.emptyskz.dao;

import com.emptyskz.pojo.Orders;
import com.emptyskz.pojo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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

}
