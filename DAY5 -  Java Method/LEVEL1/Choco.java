import java.util.Scanner;

public class Choco {
    public static double ChocoGiven(int a,int b){
        int c=a/b;
        return c;

    }
    public static double ChocoRem(int a,int b){
        int d=a%b;
        return d;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int noOfChococlate = reader.nextInt();
        int noOfStudent=reader.nextInt();
         
        System.out.println(ChocoGiven(noOfChococlate, noOfStudent));
        System.out.println(ChocoRem(noOfChococlate, noOfStudent));
    }
    
}
