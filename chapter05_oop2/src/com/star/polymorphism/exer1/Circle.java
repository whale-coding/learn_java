package polymorphism.exer1;

/**
 * @Date 2023-12-16 23:14 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Circle extends GeometricObject{
    private double radius;//半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 求面积
    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
