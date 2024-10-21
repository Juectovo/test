package cn.edu.hbnu.scanner;

import java.util.Scanner;

public class ScannnerDemo1 {
    public static void main(String[] args) {
        //我是一个零基础小白，请帮我写一个程序，可以让用户键盘输入用户名和年龄
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入年龄：");
        //年龄必须是数字，如果输入不是数字，且数字不为0，若输入不是数字，则提醒用户输入数字，并返回让用户重新输入
        while (!scanner.hasNextInt()) {
            System.out.println("年龄必须是数字，请重新输入：");
            scanner.next();
        }
        int age = scanner.nextInt();
        System.out.println("username:" + username + ",age:" + age);


        System.out.println("=================");
        //我是一个零基础小白，请帮我写一个程序，可以让用户键盘自己设定一个密码，设定密码后对用户的密码记录，请用户再次输入密码如果输入的密码正确，则输出“密码正确”，否则输出“密码错误”并阻止用户进入下一步
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password = scanner1.next();
        System.out.println("请再次输入密码：");
        String password2 = scanner1.next();
        if (password.equals(password2)) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
            /*
            若密码错误，则返回上一步让用户重新输入密码
            return
             */
            return;
            //return 退出方法
        }
    }
}
