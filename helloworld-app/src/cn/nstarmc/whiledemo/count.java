package cn.nstarmc.whiledemo;

public class count {
   public static void main(String[] args) {
        double mountain = 8848860;//8848.86米
        double paper =0.1;
        double temp=paper;
        int count=0;
        //计算 mountain
        while(temp <= mountain){
            temp=2*temp;
            count++;
        }
        System.out.println("需要折"+count+"次");
    }
}
