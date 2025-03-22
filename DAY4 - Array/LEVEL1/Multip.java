import java.util.Scanner;

public class Multip {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=5;
        int[] num=new int[11];
        for(int i=0;i<num.length;i++){
            num[i]=number*i;
        }
        int i=0;
        for(int element:num){
            System.out.println(number+" * "+i+" = "+element);
            i++;
        }
    }
}
