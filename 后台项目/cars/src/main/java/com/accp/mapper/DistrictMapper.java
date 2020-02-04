package com.accp.mapper;

import com.accp.domain.District;
import com.accp.domain.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    int countByExample(DistrictExample example);

    int deleteByExample(DistrictExample example);

    int deleteByPrimaryKey(Integer districtid);

    int insert(District record);

    int insertSelective(District record);

    List<District> selectByExample(DistrictExample example);

    District selectByPrimaryKey(Integer districtid);

    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}