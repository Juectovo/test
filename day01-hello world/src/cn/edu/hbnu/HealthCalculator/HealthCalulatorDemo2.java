    package cn.edu.hbnu.HealthCalculator;

    import java.util.Scanner;

    public class HealthCalulatorDemo2 {
    public static void main(String[] args) {
        System.out.println("欢迎使用健康计算器");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的性别:(男/女)");
        String sex = sc.next();
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入您的身高(单位：米):");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重:(单位：kg)");
        double weight = sc.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("您的BMI指数为:" + BMI);
        double BMR =sex.equals("男") ? 88.362 + 13.397 / weight + 4.799 / height * 100 - 5.677 * age : 447.593 + 9.247 / weight + 3.098 * height  * 100- 4.330 / age;
        System.out.println("您的基础代谢率BMR为:" + BMR);
        System.out.println("是否需要增重：" + ( BMI > 25 ? "是" : "否"));
        System.out.println("是否需要减肥：" + (BMI < 18.5 ? "是" : "否"));
        System.out.println("是否需要运动：" + (BMR > 2000 ? "是" : "否"));
        System.out.println("哥们儿该减肥啦" + (BMI > 25 ));
        System.out.println("哥们儿多吃点儿" + (BMI < 18.5));
        System.out.println("谢谢使用健康计算器by ct");
    }
}

