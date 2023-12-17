package com.star.polymorphism.exer2;

/**
 * @Date 2023-12-16 22:47 星期六
 * @Author: 聂建强
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());  // 狗吃骨头  狗急跳墙
        test.adopt(new Cat());  // 猫吃鱼    猫跳~~
    }

    public void adopt(Animal animal){
        animal.eat();
        animal.jump();

        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchDoor();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}


class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
