import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any number");
        int no=reader.nextInt();

        int[] num=new int[10];
        for(int i=1;i<num.length+1;i++){
            num[i-1]=no*i;

        }
        int i = 1;
        for(int element:num){
            System.out.println(no + "*" + i + "==" + element);
            i++;

        }
    }
    
}
