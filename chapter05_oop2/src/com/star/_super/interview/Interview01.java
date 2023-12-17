package _super.interview;

/**
 * @Date 2023-12-16 18:34 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Interview01 {
    public static void main(String[] args) {
        new A(new B());  // B A AB  (B1的结果)   // A B A AB  (B2的结果)
    }
}


class A{
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

// B1
// class B {
//    public B() {
//        System.out.println("B");
//    }
// }


// B2
class B extends A{
    public B() {
        System.out.println("B");
    }
}
