package polymorphism.exer3;

/**
 * @Date 2023-12-16 23:33 星期六
 * @Author: 聂建强
 * @Description:
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }

    public void method(Person e){

        System.out.println(e.getInfo());

        //方式1：
       // if(e instanceof Graduate){
       //     System.out.println("a graduated student");
       //     System.out.println("a student");
       //     System.out.println("a person");
       // }else if(e instanceof Student){
       //     System.out.println("a student");
       //     System.out.println("a person");
       // }else{
       //     System.out.println("a person");
       // }

        //方式2
        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }

        if(e instanceof Student){
            System.out.println("a student");
        }

        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}
