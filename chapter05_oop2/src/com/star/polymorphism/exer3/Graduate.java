package polymorphism.exer3;

/**
 * @Date 2023-12-16 23:32 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
