package loopStatement;

/**
 * @Date 2023/11/30 19:38
 * @Author: 聂建强
 * @Description:  "无限"循环结构的使用
 *1. 格式： while(true)  或  for(;;)
 * <p>
 * 2.开发中，有时并不确定需要循环多少次，需要根据循环体内部某些条件，来控制循环的结束（使用break）。
 *
 * 3. 如果此循环结构不能终止，则构成了死循环！开发中要避免出现死循环。
 *
 */
public class ForWhileTest {
    public static void main(String[] args) {
        for (;;){
            System.out.println("I LOVE You");
        }
          // 死循环的后面不能有执行语句。
          // System.out.println("end");


    }
}
