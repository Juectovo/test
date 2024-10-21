package cn.edu.hbnu.HealthCalculator;

import java.util.Scanner;

public class HealthCalculatorDemo1 {
    public static void main(String[] args) {
        //目的；定义方法计算BMI值和BMR值
        System.out.println("欢迎使用健康计算器！");
        System.out.println("请输入性别：");
        int sex = new Scanner(System.in).nextInt();
        System.out.println("请输入年龄：");
        int age = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高(单位：米)：");
        double height = sc.nextDouble();
        System.out.println("请输入体重(单位：千克)：");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI值：" + bmi);
        //区别男女性的bmr计算公式
        double bmr = sex == 1 ? 66 + 13.7 * weight + 5 * height - 6.8 * age : 655 + 9.6 * weight + 1.8 * height - 4.7 * age;
       System.out.printf("%.2f",bmr);
        System.out.println("BMR值：" + bmr);
        System.out.println("是否需要增重：" + (bmi > 25 ? "是" : "否"));
        System.out.println("是否需要减肥：" + (bmi < 18.5 ? "是" : "否"));
        System.out.println("是否需要运动：" + (bmr < 2000 ? "是" : "否"));
        return;
    }
}
