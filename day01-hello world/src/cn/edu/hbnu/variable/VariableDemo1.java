package cn.edu.hbnu.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        printVariable();
    }

    public static void printVariable() {
        int age = 10;
        System.out.println(age);
        double grades = 90.5;
        System.out.println(grades);

        System .out.println("=================");

        int number = 8;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println("===========");
        int age2 = 18;
        age2 = 19;
        System.out.println(age2);

        age2 = age2 + 1;
        System.out.println(age2);
        age2 = age2 + 100;
        System.out.println(age2);

        double number2 =127;
        number2 = number2 * 36;
        System.out.println(number2);

        System .out.println("=================");
        /*
        目前微信钱包里面有666元，发出去了50块，又收到了33.3块
        请实时记录里面的金额
         */
        double money = 666;
        System.out.println(money);
        money = money - 50;
        System.out.println(money);
        money = money + 33.3;
        System.out.println(money);

        System.out.println("=================");

    }
}




