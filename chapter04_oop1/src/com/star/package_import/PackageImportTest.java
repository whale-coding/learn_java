package com.star.package_import;

import oop.method_more._04recursion.RecursionTest;
import oop.method_more._04recursion.exer2.RabbitExer;
import java.lang.reflect.Field;
import java.util.*;

import static java.lang.Math.PI;
import static java.lang.System.out;

/**
 * @Date 2023-12-11 22:59 星期一
 * @Author: 聂建强
 * @Description:
 */
public class PackageImportTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        String str = "hello";
        out.println(str);

        Person p = new Person();

        Field field = null;

        RecursionTest test = null;

        RabbitExer exer = null;

        //Date可以使用import的方式指明
        Date date = new Date();

        //使用全类名的方式
        java.sql.Date date1 = new java.sql.Date(121231231L);

        out.println("hello");

        out.println(PI);
    }
}
