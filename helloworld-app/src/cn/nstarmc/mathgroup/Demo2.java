package cn.nstarmc.mathgroup;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //输入6组数据，求平均
        int [] score=new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("请输入下一个数据");
            score[i]= scanner.nextInt();
        }
        double temp=0;
        for (int i = 0; i < score.length; i++) {
            temp=temp+score[i];
        }

        System.out.println("平均：" + temp/score.length);
    }
}
