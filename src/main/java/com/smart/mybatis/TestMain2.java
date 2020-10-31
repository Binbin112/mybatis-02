package com.smart.mybatis;

import com.smart.mybatis.service.UserService;
import com.smart.mybatis.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain2 {
    public static void main(String[] args) {
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(TestMain.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession(true);
        UserService userService = new UserServiceImpl(sqlSession);
        int i = userService.removeUser(3);
    }
}
