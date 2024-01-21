package com.star._throw;

/**
 * @Date 2024/1/21 15:23
 * @Author: 聂建强
 * @Description:  自定义的异常类
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -3387516999948L;

    public BelowZeroException(){

    }

    public BelowZeroException(String name){
        super(name);
    }

    public BelowZeroException(String message,Throwable cause){
        super(message,cause);
    }
}