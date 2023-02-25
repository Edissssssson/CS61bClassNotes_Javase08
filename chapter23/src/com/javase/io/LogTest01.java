package com.javase.io;

public class LogTest01 {
    public static void main(String[] args) {
        Logger.log("您有一条未读消息！");
        Logger.log("您有两条未读消息！");
        Logger.log("您有三条未读消息！");
        Logger.log("您有四条未读消息！");
        System.out.println("Record completed!");
    }
}
