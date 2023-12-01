package loopStatement;

import javax.management.MBeanAttributeInfo;

/**
 * @Date 2023-11-30 23:14 星期四
 * @Author: 聂建强
 * @Description:  break和continue关键字的使用
 *
 *1. break和continue关键字的使用
 *
 * 				使用范围			在循环结构中的作用					    相同点
 * break:			switch-case
 * 				循环结构中			结束（或跳出）当前循环结构			    在此关键字的后面不能声明执行语句。
 *
 * continue:		循环结构中			结束（或跳出）当次循环			在此关键字的后面不能声明执行语句。
 *
 *
 * 2. 了解带标签的break和continue的使用
 *
 * 3. 开发中，break的使用频率要远高于continue。
 *
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        // break
        for (int i =1;i<=10;i++){
            if (i%4==0){
                break;
                //编译不通过
                //System.out.println("今晚上迪丽热巴要约我！");
            }
            System.out.println(i);
        }
        System.out.println("------------------");

        // continue
        for (int i =1;i<=10;i++){
            if (i%4==0){
                continue;
                //编译不通过
                //System.out.println("今晚上迪丽热巴要约我！");
            }
            System.out.println(i);
        }
        System.out.println("------------------");

        // 体会break和continue
        for (int j=1;j<=4;j++){
            for (int i =1;i<=10;i++){
                if (i%4==0){
                    continue;
                    //break
                }
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("------------------");

        // 带标签的break和continue
        label:for(int j = 1;j <= 4;j++){
            for(int i = 1;i <= 10;i++){
                if(i % 4 == 0){
                    //了解
                    break label;
                    //continue label;
                }

                System.out.print(i);
            }
            System.out.println();

        }

    }
}
