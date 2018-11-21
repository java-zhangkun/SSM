package com.oracle.mapper;

import com.oracle.pojo.OrderDetails;

public interface OrderDetailsMapper {
    int deleteByPrimaryKey(Integer detailId);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(Integer detailId);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);
}