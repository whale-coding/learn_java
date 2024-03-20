package com.star.list_03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: InterviewTest
 * @Date: 2024/3/20 21:52
 * @Author: 聂建强
 * @Description: List的remove方法面试题
 */
public class InterviewTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1); //自动装箱
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);  // 不同情况，输出结果不一样
    }

    private static void updateList(List list) {
        // list.remove(2);  // 移除索引为2的元素
        list.remove(Integer.valueOf(2));  // // 移除数据2
    }
}
