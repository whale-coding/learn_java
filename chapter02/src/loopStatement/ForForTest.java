package loopStatement;

/**
 * @Date 2023/11/30 20:00
 * @Author: 聂建强
 * @Description:  嵌套循环的使用
 *
 * 1. 嵌套循环：是指一个循环结构A的循环体是另一个循环结构B。
 * - 外层循环：循环结构A
 * - 内层循环：循环结构B
 * <p>
 * 2. 说明：
 * 1）内层循环充当了外层循环的循环体。
 * 2）对于两层嵌套循环来说，外层循环控制行数，内层循环控制列数。
 * 3）举例：外层循环执行m次，内层循环执行n次，则内层循环的循环体共执行m * n次
 * 4）实际开发中，我们不会出现三层以上的循环结构，三层的循环结构都很少见。
 */
public class ForForTest {
    public static void main(String[] args) {
        // ******
        for (int i=0;i<5;i++){
            System.out.print('*');
        }
        System.out.println("\n-------------------------");

        /*
         ******
         ******
         ******
         ******
         ******
         */
        for (int i=0;i<5;i++){
            for (int j =0;j<6;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n-------------------------");

       /*
						i(第几行)		j(每一行中*的个数)
		*				1				1
		**				2				2
		***				3				3
		****			4				4
		*****			5				5

		*/
        for (int i =0;i<5;i++){
            for (int j =0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n-------------------------");

        /*
						i(第几行)		j(每一行中*的个数)		i + j = 7 --> j = 7 - i
		******			1				6
		*****			2				5
		****			3				4
		***				4				3
		**				5				2
		*				6				1

		*/

        for (int i=0;i<6;i++){
            for (int j=i;j<6;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n-------------------------");

    /*
						i(第几行)		j(每一行中-的个数)		k(每一行中*的个数)    2*i + j = 10 --->j = 10 - 2*i
--------*				1				8						1                     k = 2 * i - 1
------* * *				2				6						3
----* * * * *			3				4						5
--* * * * * * *			4				2						7
* * * * * * * * *		5				0						9

  * * * * * * *
    * * * * *
      * * *
        *

	*/
        // 上半部分
        for (int i =0;i<5;i++){
            // -
            for(int j = 1;j <= 10 - 2*i;j++){
                System.out.print(" ");
            }
            // *
            for(int k = 1;k <= 2 * i - 1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 下半部分
        for (int i =0;i<5;i++){
            // -
            for(int j = 1;j <= 2*i;j++){
                System.out.print(" ");
            }
            // *
            for(int k = 1;k <= 9-2 * i ;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
