package Variable;

/**
 * @Date 2023-11-25 20:11 星期六
 * @Author: 聂建强
 * @Description: 测试布尔类型的使用
 */
public class VariableTest4 {
    public static void main(String[] args) {
        //布尔类型：boolean，只有两个取值：true 、 false
        boolean bo1 = true;
        boolean bo2 = false;

        //编译不通过
        //boolean bo3 = 0;

        //常使用在流程控制语句中。比如：条件判断、循环结构等
        boolean isMarried = true;
        if(isMarried){
            System.out.println("很遗憾，不能参加单身派对了");
        }else{
            System.out.println("可以多谈几个女朋友或男朋友");
        }
        //了解：我们不谈boolean类型占用的空间大小。但是，真正在内存中分配的话，使用的是4个字节。
    }
}
