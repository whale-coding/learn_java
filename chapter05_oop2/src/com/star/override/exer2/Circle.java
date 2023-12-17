package override.exer2;

/**
 * @Date 2023-12-15 20:45 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Circle {
    private double radius;  // 半径

    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // 求圆的面积
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
