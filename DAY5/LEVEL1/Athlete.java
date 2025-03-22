import java.util.Scanner;

public class Athlete {
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static double div(double x,double y){
        return x/y;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        int distance=5;
        int perimeter=add(a,b,c);
        double rounds=div(distance,perimeter);
        System.out.println(perimeter);
        System.out.println(rounds);

    }
    
}
