package com.star.iterator_02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname: IteratorTest
 * @Date: 2024/3/18 23:37
 * @Author: 聂建强
 * @Description:  测试迭代器Iterator
 */
public class IteratorTest {
    /**
     * 如何实现遍历
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("AA");
        coll.add(128);
        coll.add(new String("尚硅谷"));

        // 获取迭代器对象
        Iterator iterator = coll.iterator();

        // 遍历方式1：for循环+iterator.next(),不常用
        // next()方法的作用：① 指针下移 ② 将下移以后集合位置上的元素返回
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(iterator.next());
        }

        // 遍历方式2：while循环+iterator.hasNext()+iterator.next(),常用，推荐使用
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 错误的遍历方式
     */
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("AA");
        coll.add(128);
        coll.add(new String("尚硅谷"));

        // 错误的遍历方式1：
        Iterator iterator = coll.iterator();
        while((iterator.next()) != null){
            System.out.println(iterator.next());
        }
        // 错误的遍历方式2：
        //每次调用coll.iterator()，都会返回一个新的迭代器对象。
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }
}
