package object.tostring.exer;

/**
 * @Date 2023-12-17 12:56 星期日
 * @Author: 聂建强
 * @Description:
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

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

    //求圆的面积
    public double findArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
