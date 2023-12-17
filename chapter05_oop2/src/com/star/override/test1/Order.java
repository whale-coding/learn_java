package override.test1;

/**
 * @Date 2023-12-15 21:03 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}

    // 类内部
    public void show(){
        orderPrivate = 1;
        orderDefault = 1;
        orderProtected = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
