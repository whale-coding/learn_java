package Variable;

/**
 * @Date 2023-11-25 20:09 星期六
 * @Author: 聂建强
 * @Description: 测试字符类型的使用
 */
public class VariableTest3 {
    public static void main(String[] args) {
        //表示形式1：使用一对''表示，内部有且仅有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';
        char c5 = 'γ';

        //编译不通过
        //char c6 = '';
        //char c7 = 'ab';

        //表示形式2：直接使用Unicode值来表示字符型常量。
        char c8 = '\u0036';
        System.out.println(c8);  // 6

        //表示形式3：使用转义字符
        char c9 = '\n';
        char c10 = '\t';
        System.out.println("hello" + c10 + "world");  // hello	world

        //表示形式4：使用具体字符对应的数值（比如ASCII码）
        char c11 = 97;
        System.out.println(c11);  // a

        char c12 = '1';  // 数字1
        char c13 = 1;    // ASCII码为1的字符
    }
}
