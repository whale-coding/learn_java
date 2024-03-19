package com.star.list_03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname: ListTest
 * @Date: 2024/3/19 22:57
 * @Author: 聂建强
 * @Description: List接口的常用方法测试
 */
public class ListTest {
    /**
     * 增加相关的方法：
     * add(Object obj)
     * add(int index, Object obj)
     * addAll(Collection coll)
     * addAll(int index, Collection coll)
     */
    @Test
    public void test1(){
        List list = new ArrayList();

        // add(Object obj)
        list.add("AA");
        list.add("BB");
        list.add(123);  // 自动装箱
        System.out.println(list);

        // add(int index, Object obj)
        list.add(2,"CC");
        System.out.println(list);

        // addAll(int index, Collection coll)
        List list1 = Arrays.asList(1,2,3);
        list.addAll(1,list1);  // 将list1整体作为一个元素，插入到索引1的位置
        System.out.println(list);
    }

    /**
     * 删除相关的方法：
     * remove(Object obj)
     * remove(int index)
     * removeAll(Collection coll)
     * clear()
     */
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2);

        // 删除索引为2的元素:remove(int index)
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));

        // 删除数据2:remove(Object obj)
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    /**
     * 遍历：
     * 方式1：使用迭代器
     * 方式2：使用增强for循环
     * 方式3：使用一般的for循环
     */
    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2);

        // 遍历方式1：使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 遍历方式2：使用增强for循环
        for (Object obj : list){
            System.out.println(obj);
        }

        // 遍历方式3：使用一般的for循环
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
