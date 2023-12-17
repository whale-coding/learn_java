package _extends;

/**
 * @Date 2023-12-15 20:06 星期五
 * @Author: 聂建强
 * @Description:
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Tom";
        p.eat();

        Student s = new Student();
        s.name = "Tony";
        s.eat();

        // 超纲：获取s所属类的父类
        System.out.println(s.getClass().getSuperclass());  // class _extends.Person
        // 超纲：获取p所属类的父类
        System.out.println(p.getClass().getSuperclass());  // class java.lang.Object

    }
}
