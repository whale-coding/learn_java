package polymorphism.interview;

import java.util.Random;

/**
 * @Date 2023-12-16 21:00 星期六
 * @Author: 聂建强
 * @Description:  面试题：多态是编译时行为还是运行时行为？
 * 答案：运行时行为  ，证明可以看下面的案例
 */

class Animal  {
    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat  extends Animal  {
    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog  extends Animal  {
    public void eat() {
        System.out.println("Dog eat bone");
    }
}

class Sheep  extends Animal  {
    public void eat() {
        System.out.println("Sheep eat grass");
    }
}

public class InterviewTest {
    public static Animal getInstance(int key) {
        switch (key) {
            case 0:
                return new Cat ();
            case 1:
                return new Dog ();
            default:
                return new Sheep ();
        }

    }

    public static void main(String[] args) {
        int key = new Random().nextInt(3); //0,1,2
        System.out.println(key);

        Animal  animal = getInstance(key);
        animal.eat();

    }
}
