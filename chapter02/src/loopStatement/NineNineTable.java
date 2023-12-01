package loopStatement;

import java.sql.SQLOutput;

/**
 * @Date 2023-11-30 21:49 星期四
 * @Author: 聂建强
 * @Description:  练习：九九乘法表
 */
public class NineNineTable {
    public static void main(String[] args) {
        for (int i= 0;i<9;i++){
            for (int j =1;j<=i;j++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
