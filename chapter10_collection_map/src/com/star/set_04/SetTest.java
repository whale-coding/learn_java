package com.star.set_04;

import com.star.collection_01.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Classname: SetTest
 * @Date: 2024/3/20 21:56
 * @Author: 聂建强
 * @Description: HashSet和LinkedHashSet的使用
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));

        // 遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 以为Person类中还没有从写hashCode()方法,故为false
        System.out.println(set.contains(new Person("Tom",12)));  // false
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add("BB");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
