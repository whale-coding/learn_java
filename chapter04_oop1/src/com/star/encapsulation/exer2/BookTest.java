package com.star.encapsulation.exer2;

/**
 * @Date 2023-12-13 23:03 星期三
 * @Author: 聂建强
 * @Description:
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setBookName("剑指Java");
        book1.setAuthor("尚硅谷教育");
        book1.setPrice(180.0);

        System.out.println(book1.showInfo());
    }
}
