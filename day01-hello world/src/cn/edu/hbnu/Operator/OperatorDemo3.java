package cn.edu.hbnu.Operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        print(10, 20);
        print(30);
        System.out.println("较大值:" + getMax(10, 20, 30) );
    }
        public static void print (int a,int b) {
            int max = a > b ? a : b;
            System.out.println(max);
        }


            public static void print(int score){
                String result = score >= 60 ? "及格" : "不及格";
                System.out.println(result);
        }
        public static int getMax(int a,int b,int c) {
            int max = a > b ? a > c ? a : c : b > c ? b : c;
        return max;
        }
    }
