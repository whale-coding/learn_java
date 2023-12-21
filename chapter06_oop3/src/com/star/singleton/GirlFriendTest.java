package com.star.singleton;

/**
 * @Date 2023-12-18 23:00 星期一
 * @Author: 聂建强
 * @Description:
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}

// 懒汉式单例模式
class GirlFriend{
    // 1.类的构造器私有化
    private GirlFriend(){

    }

    // 2. 声明当前类的实例
    // 4. 此属性也必须声明为static的
    private static GirlFriend instance = null;

    // 3. 通过getXxx()获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance(){

        if(instance == null){

            instance = new GirlFriend();

        }
        return instance;


    }
}
