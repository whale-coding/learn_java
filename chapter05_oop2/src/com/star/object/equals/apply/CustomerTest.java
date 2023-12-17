package object.equals.apply;

/**
 * @Date 2023-12-17 12:49 星期日
 * @Author: 聂建强
 * @Description:
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom",12,new Account(2000));
        Customer c2 = new Customer("Tom",12,new Account(2000));

        System.out.println(c1.equals(c2));  // false -->true
    }
}
