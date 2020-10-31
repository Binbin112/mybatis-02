package com.smart.mybatis.mapper;


import com.smart.mybatis.entity.Roles;
import org.apache.ibatis.annotations.Param;


public interface RolesMapper {
    Roles selectById(@Param("roleId") int roleId);

    Roles selectByUserId(@Param("userId") int userId);
}