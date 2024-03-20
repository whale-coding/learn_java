package com.star.set_04;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Classname: TreeSetTest
 * @Date: 2024/3/20 22:24
 * @Author: 聂建强
 * @Description: TreeSet的使用
 */
public class TreeSetTest {
    /**
     * 自然排序，String实现的有Comparator接口
     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        set.add("CC");
        set.add("AA");
        set.add("DD");
        set.add("MM");
        set.add("GG");
        set.add("SS");

        // set.add(123);  // 会报ClassCastException异常

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 自然排序
     */
    @Test
    public void test2(){
        TreeSet set = new TreeSet();

        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Rose",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * 定制排序
     */
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            /**
             * 按照姓名从小到大排列，如果姓名相同，继续比较age，按照从大到小排列
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return
             */
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    int value = u1.getName().compareTo(u2.getName());
                    if(value !=0){
                        return value;
                    }
                    return -(u1.getAge()-u2.getAge());
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        TreeSet set = new TreeSet(comparator);

        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Tom",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
