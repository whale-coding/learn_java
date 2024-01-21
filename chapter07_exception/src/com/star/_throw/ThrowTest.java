package com.star._throw;

/**
 * @Date 2024/1/21 15:16
 * @Author: 聂建强
 * @Description:
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.regist(10);

            s1.regist(-10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Student{
    Integer id;

    public void regist(Integer id) throws Exception{
        if (id > 0){
            this.id = id;
        }else {
            // 手动抛出异常类的对象(运行时异常、编译时异常、自定义异常)
            // throw new RuntimeException("输入的id非法");  // 运行时异常，无需处理

            // throw new Exception("输入的id非法");  // 编译时异常，需要处理，可以抛出异常或者try-catch

            throw new BelowZeroException("输入的id非法");  // 自定义异常
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}

