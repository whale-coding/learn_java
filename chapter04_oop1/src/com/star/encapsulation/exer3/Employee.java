package com.star.encapsulation.exer3;

/**
 * @Date 2023-12-13 23:04 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Employee {
    //属性
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    //提供属性的get和set方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char g) {
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfo(){
        // return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
        return getName() + "\t" + getGender() + "\t" + getAge() + "\t" + getPhoneNumber();
    }
}
