package com.smart.mybatis.entity;

import java.math.BigDecimal;

public class OrderItem {
    /**
     *
     */
    private Integer itemId;

    /**
     *
     */
    private Integer orderId;

    /**
     *
     */
    private String productName;

    /**
     *
     */
    private String productImg;

    /**
     * 价格
     */
    private BigDecimal productPrice;

    /**
     *
     */
    private Integer productQuantity;

    /**
     *
     */
    private Integer orderNo;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}

