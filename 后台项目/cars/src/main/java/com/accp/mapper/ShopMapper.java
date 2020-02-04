package com.accp.mapper;

import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shpid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shpid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}