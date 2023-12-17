package object.tostring.exer;

/**
 * @Date 2023-12-17 12:59 星期日
 * @Author: 聂建强
 * @Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);

        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相等？" + c1.equals(c2));

        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
