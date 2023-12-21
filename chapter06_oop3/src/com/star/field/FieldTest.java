package com.star.field;


/**
 * @Date 2023-12-20 22:33 星期三
 * @Author: 聂建强
 * @Description:
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);  // 1
    }
}


class Order{
    int orderId = 1;

    {
        orderId = 2;
    }

    public Order(){
        super();
        orderId = 3;
    }

    public Order(int orderId){
        this.orderId = orderId;
    }

}
