package cn.edu.hbnu.Operator;

public class OperatorDemo2 {
    //目标：理解关系运算符
    public static void main(String[] args)
    {
        //关系运算符
        //==  !=  >  >=  <  <=
        //判断两个数据是否相等
        int a = 10;
        int b = 20;
        boolean result = a == b;
        System.out.println(result);

        //判断两个数据是否不相等
        result = a != b;
        System.out.println(result);

        //判断两个数据是否大于
        result = a > b;
       System.out.println(result);
    }

}
