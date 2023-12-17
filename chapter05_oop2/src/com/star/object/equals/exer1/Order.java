package com.star.object.equals.exer1;

/**
 * @Date 2023-12-17 12:50 星期日
 * @Author: 聂建强
 * @Description:
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // 手写equals():
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj instanceof Order){
            Order order = (Order)obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}
