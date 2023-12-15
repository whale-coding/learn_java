package com.star._this;

/**
 * @Date 2023-12-14 22:25 星期四
 * @Author: 聂建强
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
       // 只创建了User类的1个对象。
        User u1 = new User("Tom",12);
    }
}


class User{
    String name;
    int age;

    // 构造器1：空参构造器
    public User() {
        //模拟对象创建时，需要初始化50行代码。
    }

    // 构造器2：一个参数构造器
    public User(String name){
        this();  // 调用空参的构造器（构造器1）
        this.name = name;
    }
    // 构造器3：二个参数构造器
    public User(String name, int age) {
        this(name);  // 调用有一个name参数的构造器（构造器2）
        // this.name = name;   // 等同于this(name);
        this.age = age;
    }

}
