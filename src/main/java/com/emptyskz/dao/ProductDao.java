package com.emptyskz.dao;

import com.emptyskz.pojo.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    //查询所有的的产品信息
    @Select("select * from product")
    public List<Product> findAll();

    //通过id查找产品
    @Select("select * from product where id = #{id}")
    public Product findById(Integer id);

    @Insert("Insert into product (productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product);
}
