import java.util.Scanner;
public class smalleset {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number");
        float a=reader.nextFloat();
        System.out.println("enter number");
        float b=reader.nextFloat();
        System.out.println("enter number");
        float c=reader.nextFloat();
        if (a>c && b>c){
            System.out.printf(c+" that is c is the lowest");
        }
        else{
            System.out.println("c is not lowest");
        }
    }
}
