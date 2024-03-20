package com.star.set_04;

/**
 * @Classname: User
 * @Date: 2024/3/20 22:29
 * @Author: 聂建强
 * @Description:
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 自定义比较的方法：先比较年龄从小到大排列，如果年龄相同，则继续比较姓名，从大到小
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof User){
            User u = (User) o;
            int value = this.age - u.age;
            if (value !=0){
                return value;
            }
            return -this.name.compareTo(u.name);
        }
        throw new RuntimeException("类型不匹配");
    }
}
