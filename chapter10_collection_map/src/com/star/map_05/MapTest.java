package com.star.map_05;

import org.junit.Test;

import java.util.*;

/**
 * @Classname: MapTest
 * @Date: 2024/3/21 21:45
 * @Author: 聂建强
 * @Description: Map相关的测试
 */
public class MapTest {
    /*
     * 测试Map中的实现类
     * */
    @Test
    public void test1(){
        Map map = new HashMap();
        // HashMap的key和value可以为空
        map.put(null,null);

        System.out.println(map);
    }
    
    @Test
    public void test2(){
        Map map = new Hashtable();
        // Hashtable的key和value都不能为null
        map.put(null,123);
        map.put("AA",null);

        System.out.println(map);
    }
    @Test
    public void test3(){
        LinkedHashMap map = new LinkedHashMap();
        map.put("Tom",23);
        map.put("CC",new Date());
        map.put(34,"AA");
        // 因为底层使用了双向链表，打印顺序和添加顺序一致
        System.out.println(map);
    }
    /*
    * 测试Map中的常用方法
    *
    *     增：
            put(Object key,Object value)
            putAll(Map m)
        删：
            Object remove(Object key)
        改：
            put(Object key,Object value)
            putAll(Map m)
        查：
            Object get(Object key)
        长度：
            size()
        遍历：
           遍历key集：Set keySet()
           遍历value集：Collection values()
           遍历entry集：Set entrySet()
    *
    * */
    @Test
    public void test4(){
        Map map = new HashMap();
        // 添加：put(Object key,Object value)
        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put("CC",new Date());
        System.out.println(map);
        // size()
        System.out.println(map.size());
        // 删除：Object remove(Object key)
        Object value = map.remove("AA");
        System.out.println(value);
        System.out.println(map);
        // 修改：put(Object key,Object value)
        Object oldValue = map.put("BB",123);
        System.out.println(oldValue);  // 78,因为put()返回值为之间的值，实际map中的值已经被修改了
        System.out.println(map);  // BB=123

        // get(Object key)
        System.out.println(map.get("BB"));
        System.out.println(map.get(67));
    }
    /*
     * 测试Map中的遍历方式
     */
    @Test
    public void test5(){
        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);

        // 遍历key集：Set keySet()
        Set keySet = map.keySet();
        // 使用迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        // 增强for循环
        for (Object key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }

        // 遍历value集：Collection values()
        // 方式1：推荐
        Collection values = map.values();
        // 使用增强for循环
        for (Object value : values) {
            System.out.println(value);
        }
        // 方式2：利用keySet()
        Set keySet1 = map.keySet();
        for (Object key : keySet1) {
            Object value = map.get(key);
            System.out.println(value);
        }
    }
    /*
     *  遍历Map中的entry集
     */
    @Test
    public void test6(){
        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);

        // 方式1：遍历entry集：Set entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            // 方法1:
            // System.out.println(iterator.next());
            // 方法2:
            // entrySet中的元素都是entry对象,entry对象中封装了key和value
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        // 方式2：遍历entry集：keySet()、get(key)
        Set keySet = map.keySet();
        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
