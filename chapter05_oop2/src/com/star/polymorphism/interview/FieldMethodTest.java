package polymorphism.interview;

/**
 * @Date 2023-12-16 21:00 星期六
 * @Author: 聂建强
 * @Description:   多态的笔试题
 */

class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);  // 20
        s.display();  // 20
        Base b = s;
        System.out.println(b == s);  // true
        System.out.println(b.count);  // 10  多态：属性编译和运行都看左边
        b.display();  // 20  多态：方法编译看左边，运行看右边

        Base b1 = new Base();
        System.out.println(b1.count);  // 10
        b1.display();  // 10
    }
}
