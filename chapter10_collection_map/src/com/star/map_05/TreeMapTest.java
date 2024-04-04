package com.star.map_05;

import com.star.set_04.User;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Classname: TreeMapTest
 * @Date: 2024/3/21 23:14
 * @Author: 聂建强
 * @Description:
 */
public class TreeMapTest {
    @Test
    public void test1(){
        TreeMap map = new TreeMap();

        map.put("A", "89");
        map.put("B", "99");
        map.put("G", "50");
        map.put("E", "89");
        // map.put(67,"88");  // 报错，因为key的类型(Integer)与之前的key的类型(String)不一致

        // 自然排序遍历
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
    }

    /**
     * 自定义排序
     */
    @Test
    public void test2(){
        TreeMap map = new TreeMap();

        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Tom",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        map.put(u1, 89);
        map.put(u2, 99);
        map.put(u3, 50);
        map.put(u4, 89);
        map.put(u5, 89);
        // 自然排序遍历
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
    }
    /**
     * 定制排序
     */
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    int value = u1.getName().compareTo(u2.getName());
                    if (value !=0){
                        return value;
                    }
                    return u1.getAge()-u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeMap map = new TreeMap(comparator);
        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Tom",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        map.put(u1, 89);
        map.put(u2, 99);
        map.put(u3, 50);
        map.put(u4, 89);
        map.put(u5, 89);
        // 定制排序遍历
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
    }

}
