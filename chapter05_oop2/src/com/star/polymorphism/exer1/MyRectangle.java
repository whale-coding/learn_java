package polymorphism.exer1;

/**
 * @Date 2023-12-16 23:17 星期六
 * @Author: 聂建强
 * @Description:
 */
public class MyRectangle extends GeometricObject{
    private double width;//宽
    private double height;//高

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 求面积
    @Override
    public double findArea() {
        return width * height;
    }
}
