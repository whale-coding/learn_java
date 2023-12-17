package polymorphism;

/**
 * @Date 2023-12-16 22:36 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Man extends Person{
    boolean isSmoking;

    int id = 1002;

    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }
    @Override
    public void walk(){
        System.out.println("男人笔挺的走路");
    }

    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }

}
