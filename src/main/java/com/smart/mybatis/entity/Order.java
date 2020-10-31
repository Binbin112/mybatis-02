package com.smart.mybatis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// 外键字段   使用唯一约束
// 关系模型
// 订单  对应一个 用户

public class Order implements Serializable {
    /**
     *
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 0表示未支付 1表示支付
     */
    private Integer status;

    private User user;
    private List<OrderItem> orderItems;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}

