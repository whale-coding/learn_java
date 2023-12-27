package com.star._interface.exer2;

/**
 * @Date 2023-12-22 22:51 星期五
 * @Author: 聂建强
 * @Description:
 */
public interface CompareObject {

    // 若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}
