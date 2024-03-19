package com.star.collection_01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Classname: CollectionTest
 * @Date: 2024/3/18 23:12
 * @Author: 聂建强
 * @Description: 测试Collection中方法的使用
 */
public class CollectionTest {
    /**
     * 1、添加:
     * (1): add(Object obj)：添加元素对象到当前集合中
     * (2): addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        // add(Object obj)
        coll.add("Aa");
        coll.add(123);  // 自动装箱
        coll.add("List集合");
        coll.add(true);
        coll.add(new Object());
        coll.add(new Person("小张",15));

        System.out.println(coll);

        // addAll(Collection other)
        Collection col2 = new ArrayList();
        col2.add("bb");
        col2.add(123);

        System.out.println(coll.size());  // 6

        coll.addAll(col2);

        System.out.println(coll);
        System.out.println(coll.size());  // 8

        // coll.add(col2);
        // System.out.println(coll);
        // System.out.println(coll.size());  // 7
    }

    /**
     * 2、判断
     * (3) int size()：获取当前集合中实际存储的元素个数
     * (4) boolean isEmpty()：判断当前集合是否为空集合
     * (5) boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
     * (6) boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
     * (7) boolean equals(Object obj)：判断当前集合与obj是否相等
     */
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("Aa");
        coll.add(128);
        coll.add(new String("List集合"));
        coll.add(true);
        coll.add(new Person("小张",15));

        // int size()
        System.out.println(coll.size());  // 5

        // boolean isEmpty()
        System.out.println(coll.isEmpty());  // false

        // boolean contains(Object obj)
        System.out.println(coll.contains("Aa"));  // true
        System.out.println(coll.contains(128));  // true
        // 会调用equals()方法，而String是重写过equals()方法的
        System.out.println(coll.contains(new String("List集合")));  // true
        // 如果Person类中重写过equals()方法,结果为true，如果没有从写过，则结果为false
        // 集合中如果添加的是自定义的类，一般要重写equals()方法
        System.out.println(coll.contains(new Person("小张",15)));  // true

        // boolean containsAll(Collection coll)
        Collection coll2 = new ArrayList();
        coll2.add("Aa");
        coll2.add(128);

        System.out.println(coll.containsAll(coll2));  // true

        // boolean equals(Object obj),比较的是集合内的元素
        Collection coll3 = new ArrayList();
        coll3.add("Aa");

        Collection coll4 = new ArrayList();
        coll4.add("Aa");

        Collection coll5 = new ArrayList();
        coll5.add("22");

        System.out.println(coll3.equals(coll4));  // true
        System.out.println(coll3.equals(coll5));  // false
    }

    /**
     * 3、删除
     * (8) void clear()：清空集合元素
     * (9) boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
     * (10) boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
     * (11) boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
     */
    @Test
    public void test3(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);
        coll.add(new String("尚硅谷"));
        System.out.println(coll);

        // remove(Object obj)
        coll.remove(128);
        System.out.println(coll);
        // remove()方法会调用equals()方法
        coll.remove(new Person("Tom",12));
        System.out.println(coll);
        // remove()方法一次只会删除一个
        coll.remove("AA");
        System.out.println(coll);

        // void clear()
        coll.clear();
        System.out.println(coll);  // []
        System.out.println(coll.size());  // 0

        // boolean removeAll(Collection coll)
        Collection coll2 = new ArrayList();
        coll2.add("AA");
        coll2.add("BB");
        Collection coll3 = new ArrayList();
        coll3.add("AA");

        coll2.removeAll(coll3);

        System.out.println(coll2);  // [BB]

        // boolean retainAll(Collection coll)
        Collection coll4 = new ArrayList();
        coll4.add("AA");
        coll4.add("BB");
        coll4.add("CC");
        Collection coll5 = new ArrayList();
        coll5.add("AA");
        coll5.add("BB");

        coll4.retainAll(coll5);
        System.out.println(coll4);  // [AA, BB]
    }

    /**
     * 4、其他
     * (12) Object[] toArray()：返回包含当前集合中所有元素的数组
     * (13) hashCode()：获取集合对象的哈希值
     * (14) iterator()：返回迭代器对象，用于集合遍历
     */
    @Test
    public void test4(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);
        coll.add(new String("尚硅谷"));

        // toArray():集合 ---> 数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        // hashCode():获取集合的hash值
        System.out.println(coll.hashCode());
    }

    /**
     *  数组转换成集合：调用Arrays的静态方法asList(Object ... objs)
     */
    @Test
    public void test5(){
        String[] arr = new String[]{"AA", "BB", "CC"};
        // 数组--->集合
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        List<String> list2 = Arrays.asList("AA", "BB", "CC", "DD");
        System.out.println(list2);
    }

    /**
     * 笔试题：asList(Object ... objs)方法
     */
    @Test
    public void test6(){
        Integer[] arr = new Integer[]{1, 2, 3};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list.size());  // 3
        System.out.println(list);

        int[] arr2 = new int[]{1, 2, 3};
        List<int[]> list2 = Arrays.asList(arr2);
        // 把这个数字当成了一个对象，所以size()方法返回的是1
        System.out.println(list2.size());  // 1
        System.out.println(list2);
    }


}
