package override.exer2;

/**
 * @Date 2023-12-15 20:44 星期五
 * @Author: 聂建强
 * @Description:
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("圆柱的表面积：" + cy.findArea());
    }
}
