package com.smart.mybatis;

import com.smart.mybatis.entity.Roles;
import com.smart.mybatis.mapper.RolesMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 删除主表数据
 * 从表数据如何处理  要么一起删除
 * 性能太差了
 * 权限表
 * 论坛
 * 管理有  删除帖子
 * 普通  用户  只能查看
 * 权限  删除权限  查看权限  对记录的增删改查
 * 角色  权限的集合   admin   user  guest
 * 权限表
 * name add   del 删除权限   view 查看
 * declare  添加权限
 * 多对多时候 一定第三张中间
 */
public class TestMain {
    // 外键字段  微服务里
    public static void main(String[] args) {
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(TestMain.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession(true);
//        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        //一对一的查询
//        Order order = mapper.selectOrderByNo(123);
//        一对一的保存
        // 映射关系   先保存主表获取主表的ID 将主表的ID的值设置给从表的外键
        // 更新
        // 删除 假删除
//        System.out.println(order);
//        List<Order> orders = mapper.selectOrderByUserId(2);
        RolesMapper mapper = sqlSession.getMapper(RolesMapper.class);
        Roles roles = mapper.selectByUserId(2);
        System.out.println(roles);

    }
}
