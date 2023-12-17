package override.test2;

import override.test1.Order;

/**
 * @Date 2023-12-15 21:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class SubOrder extends Order {
    public void method(){

        orderProtected = 1;
        orderPublic = 1;

        methodProtected();
        methodPublic();

        // 不能访问
       // orderPrivate = 1;
       // orderDefault = 1;
       //
       // methodPrivate();
       // methodDefault();
    }
}
