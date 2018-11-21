package com.oracle.mapper;

import com.oracle.pojo.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}