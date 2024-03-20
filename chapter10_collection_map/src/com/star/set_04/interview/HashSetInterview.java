package com.star.set_04.interview;


import java.util.HashSet;

/**
 * @Classname: HashSetInterview
 * @Date: 2024/3/20 23:21
 * @Author: 聂建强
 * @Description: hashset面试题
 */
public class HashSetInterview {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);

        set.add(new Person(1001,"CC"));
        System.out.println(set);

        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }
}
