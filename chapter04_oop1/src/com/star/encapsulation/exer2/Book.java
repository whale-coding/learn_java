package com.star.encapsulation.exer2;

/**
 * @Date 2023-12-13 23:02 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Book {
    private String bookName; //书名
    private String author; //作者
    private double price; //价格

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    //获取读书信息
    public String showInfo() {
        return "bookName : " + bookName + ", author : " + author + ", price : " + price;
    }
}
