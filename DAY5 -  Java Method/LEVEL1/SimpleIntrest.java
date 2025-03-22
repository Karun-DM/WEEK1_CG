import java.util.Scanner;

public class SimpleIntrest{


    public static double intrest(double principal,double rateofintrest,double time){
        return (principal*rateofintrest*time)/100;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double principal=reader.nextDouble();
        double rateofintrest=reader.nextDouble();
        double time=reader.nextDouble();
        double c=intrest(principal,rateofintrest,time);
        System.out.println(c);
    }
}