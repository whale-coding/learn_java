package _super;

/**
 * @Date 2023-12-15 20:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Student extends Person {
    String school;

    int id = 1002;  // 学号

    public void study(){
        System.out.println("学生学习");
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    @Override
    public void sleep() {
        System.out.println("学生保证每天不低于10个小时的睡眠");
    }

    // 测试super调用方法、属性
    public void show(){
        eat(); //省略了this
        this.eat();

        super.eat();  // 调用父类的eat方法
    }

    public void show1(){
        doSport();
        this.doSport();
        super.doSport();
    }

    public void show2(){
        System.out.println(id);  // 1002
        System.out.println(this.id);  // 1002

        System.out.println(super.id);  // 1001  父类的id
    }

    public void show3(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    //测试super调用父类的构造器
    public Student(){
        super();
       // this("Tom",12);
        System.out.println("Student()...");
    }
    public Student(String name,int age){
       // setAge(age);
       // super.name = name;

        super(name,age);
    }
}
