package com.emptyskz.dao;

import com.emptyskz.pojo.Memeber;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MemeberDao {
    //通过Id查找会员
    @Select("select * from orders where id = #{id}")
    public Memeber findById(Integer id);
}
