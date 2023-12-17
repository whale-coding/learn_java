package polymorphism.exer4;

/**
 * @Date 2023-12-16 23:35 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Man extends Person{
    public void eat(){
        System.out.println("男人大口的吃饭");
    }

    public void toilet(){
        System.out.println("男人去男厕所");
    }

    public void smoke(){
        System.out.println("厕后一支烟");
    }
}
