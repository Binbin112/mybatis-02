package com.smart.mybatis.service.impl;


import com.smart.mybatis.entity.Privilege;
import com.smart.mybatis.entity.Roles;
import com.smart.mybatis.mapper.RolesMapper;
import com.smart.mybatis.mapper.UserMapper;
import com.smart.mybatis.service.UserService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class UserServiceImpl implements UserService {
    UserMapper userMapper;
    RolesMapper rolesMapper;

    public UserServiceImpl(SqlSession sqlSession) {
        userMapper = sqlSession.getMapper(UserMapper.class);
        rolesMapper = sqlSession.getMapper(RolesMapper.class);
    }

    // admin  认证 登录过程  授权  权限认证框架
    @Override
    public int removeUser(int uid) {
        // 通过用户的ID查询当前用户的权限
        Roles roles = rolesMapper.selectByUserId(2);
        // 判断是否有权限
        if (hasPrivileges(roles.getPrivileges())) {
            // 删除指定的用户
            int i = userMapper.deleteUser(uid);
        } else {
            System.out.println("暂无权限! 请与管理员联系");
        }
        return 0;
    }

    // juc
    public boolean hasPrivileges(List<Privilege> privileges) {
        AtomicBoolean flag = new AtomicBoolean(false);
        privileges.forEach(privilege -> {
            if (privilege.getName().equals("del")) {
                flag.set(true);
            }
        });
        return flag.get();
    }

}
