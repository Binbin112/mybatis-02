package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IfMapper {
    User selectUser(@Param("user") User user);

    int update(@Param("user") User user);

    int batchUsers(@Param("users") List<User> users);
}
