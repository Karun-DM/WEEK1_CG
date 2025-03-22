import java.util.Scanner;

public class Quadratic {
    public static void roots(int b,double delta,int a){
        double x=(-b+Math.sqrt(delta))/(2*a);
        System.out.println(x);
        double y=(-b-Math.sqrt(delta))/(2*a);
        System.out.println(y);
    }
    public static void rootss(int b,int a){
        double x=-b/(2*a);
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        double delta=Math.pow(b,2)-(4*a*c);
        if (delta>0){
            roots(b,delta,a);

        }
        else if(delta==0){
            rootss(b,a);
        }
    }
}
    

