import java.util.Scanner;

public class Quotient {
    public static double Quotient(double a,double b){
        double e=a/b;
        return (int)e;
        
    }
    public static double Remainder(double a,double b){
        double f=a%b;
        return f;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a=reader.nextDouble();
        double b=reader.nextDouble();
        double c=Quotient(a,b);
        double d=Remainder(a,b);
        System.out.println(c);
        System.out.println(d);


    }
    
}
