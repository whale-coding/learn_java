package _extends.exer1;

/**
 * @Date 2023-12-15 20:44 星期五
 * @Author: 聂建强
 * @Description:
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        // 来自于父类中声明的方法
        kid.employeed();
        kid.manOrWoman();

        // Kids类自己声明的方法
        kid.printAge();
    }
}
