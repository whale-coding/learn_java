package com.star.iterator_02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Classname: ForTest
 * @Date: 2024/3/19 22:39
 * @Author: 聂建强
 * @Description: 测试增强for循环（foreach循环）
 */
public class ForeachTest {
    
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));

        for (Object obj : coll) {
            System.out.println(obj);
        }
    }
    
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};

        for (int i : arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"GG","JJ","DD","MM","SS"};

        for (String str : arr){
            System.out.println(str);
        }
    }
}
