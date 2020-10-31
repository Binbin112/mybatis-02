package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface OrderMapper {
    Order selectOrderByNo(@Param("orderNo") int no);

    List<Order> selectOrderByUserId(@Param("userId") int userId);

}
