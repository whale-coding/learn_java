package com.star.method_more._02args.exer;

/**
 * @Date 2023-12-10 23:06 星期日
 * @Author: 聂建强
 * @Description:
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();

        String info = test.concat("-","hello","world");
        System.out.println(info);  // hello-world

        System.out.println(test.concat("/","hello"));  // hello

        System.out.println(test.concat("-"));  // 空

    }

    /**
     * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
     * @param operator  分割符号
     * @param strs  要拼接的字符串
     * @return  拼接好的字符串
     */
    public String concat(String operator,String ... strs){
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            if (i==0){
                result += strs[i];
            }else {
                result += (operator+strs[i]);
            }
        }
        return result;
    }
}
