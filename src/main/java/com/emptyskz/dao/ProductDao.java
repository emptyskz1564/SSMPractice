package com.emptyskz.dao;

import com.emptyskz.pojo.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    //查询所有的的产品信息
    @Select("select * from product")
    public List<Product> findAll();
}
