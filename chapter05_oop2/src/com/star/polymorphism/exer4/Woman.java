package polymorphism.exer4;

/**
 * @Date 2023-12-16 23:35 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Woman extends Person{
    public void eat(){
        System.out.println("女人小口的吃饭");
    }

    public void toilet(){
        System.out.println("女人去女厕所");
    }

    public void makeup(){
        System.out.println("厕后补补妆");
    }
}
