package cn.nstarmc.mathgroup;

public class mathgroup {
    public static void main(String[] args) {
        int [] money= {16,26,36,6,100};
        int total=0;
        for (int i = 0; i < money.length; i++) {
            total=total+money[i];
        }
        System.out.println(total);
    }
}
