package Variable;

/**
 * @Date 2023-11-25 19:58 星期六
 * @Author: 聂建强
 * @Description: 测试浮点型变量的使用
 */
public class VariableTest2 {
    public static void main(String[] args) {
        //测试浮点类型变量的使用 float \ double
        double d1 = 12.3;

        //声明float类型变量时，需要提供后缀。后缀为'f'或'F'
        float f1 = 12.3f;

        //开发中，大家定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。
        //float类型表数范围要大于long类型的表数范围。但是精度不高。

        //测试浮点型变量的精度
        //结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
        //测试1:
        System.out.println(0.1 + 0.2);  // 0.30000000000000004

        //测试2:
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);  // 1.2312312E8
        System.out.println(ff2);  // 1.2312312E8
        System.out.println(ff1 == ff2);  // true

    }
}
