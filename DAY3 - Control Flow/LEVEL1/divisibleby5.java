import java.util.Scanner;
public class divisibleby5{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("write any number");
        float no=reader.nextFloat();
        if (no%5==0){
            System.out.printf("%.2f is divisible by 5",no);
        }
        else{
            System.out.println("not divisible");
        }
    }
}