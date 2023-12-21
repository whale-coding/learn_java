package com.star._static.apply;

/**
 * @Date 2023-12-18 22:49 星期一
 * @Author: 聂建强
 * @Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle(2.3);
        System.out.println(c4);

        System.out.println(Circle.total);
    }
}


class Circle{
    double radius;  // 实例变量

    int id;  // 编号

    static int total;  // 创建的Circle实例的个数


    private static int init = 1001; //自动给id赋值的基数
    public Circle(){
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius){
        this();  // 因为也要给id、total赋值，就直接调用上面的空参构造器
        this.radius = radius;

    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
