package com.lykj.rental.mapper;

import com.lykj.rental.model.UmsMemberLevel;
import com.lykj.rental.model.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLevelMapper {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel row);

    int insertSelective(UmsMemberLevel row);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByPrimaryKeySelective(UmsMemberLevel row);

    int updateByPrimaryKey(UmsMemberLevel row);
}