package com.emptyskz.dao;

import com.emptyskz.pojo.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravellerDao {
    //通过订单Id查询游客
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{OrderId})")
    public List<Traveller> findByOrderId(Integer OrderId);
}
