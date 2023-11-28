package Variable;

/**
 * @Date 2023-11-25 19:47 星期六
 * @Author: 聂建强
 * @Description:  测试整型变量的使用
 */
public class VariableTest1 {
    public static void main(String[] args) {
        //测试整型变量的使用 byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
        byte b1 = 12;
        byte b2 = 127;
        //编译不通过。因为超出了byte的存储范围
        //byte b3 = 128;

        short s1 = 1234;

        int i1 = 123234123;

        //声明long类型变量时，需要提供后缀。后缀为'l'或'L'
        long l1 = 123123123L;
    }
}
