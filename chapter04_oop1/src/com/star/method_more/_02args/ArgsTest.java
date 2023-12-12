package com.star.method_more._02args;

/**
 * @Date 2023-12-10 22:57 星期日
 * @Author: 聂建强
 * @Description:
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();

        test.print();
        test.print(1);
        test.print(1,2);

        test.print(new int[]{1,2,3});
    }

    public void print(int ... nums){  // 可以把可变参数当做是一个数组
        System.out.println("111");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // 编译不通过,与上面的重复了
    // public void print(int[] nums){
    //     System.out.println("111");
    // }

    public void print(int i,int ... nums){
        System.out.println("222");
    }

    // 编译不通过,可变参数列表需要声明在参数列表的最后
   //  public void print(int ... nums,int i){
   //
   // }

    public void print(int i){
        System.out.println("2222");
    }

    public void print(int i,int j){
        System.out.println("3333");
    }


    /*
    场景举例：
    * String sql = "update customers set name = ?,email = ? where id = ?";
    *
    * String sql1 = "update customers set name = ? where id = ?";
    *
    * public void update(String sql,Object ... objs);
    *
    * */

}
