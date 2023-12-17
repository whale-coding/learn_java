package object.tostring;

import java.io.File;
import java.util.Date;

/**
 * @Date 2023-12-16 23:55 星期六
 * @Author: 聂建强
 * @Description:
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom",12);
        System.out.println(u1.toString());
        System.out.println(u1);

        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("d:\\abc.txt");
        System.out.println(file);

        Date date = new Date();
        System.out.println(date);
    }
}


class User{

    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
