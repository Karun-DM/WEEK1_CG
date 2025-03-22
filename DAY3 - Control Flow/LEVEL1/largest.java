import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number");
        float a=reader.nextFloat();
        System.out.println("enter number");
        float b=reader.nextFloat();
        System.out.println("enter number");
        float c=reader.nextFloat();
        if (a>b && a>c){
            System.out.println("largest number is "+a);
        }
        else if (b>a && b>c){
            System.out.println("largest number is"+b);
        }
        else if (c>a && c>b){
            System.out.println("largest number is "+c);
        }
        else{
            System.out.println("there is some value which is equal");
        }
    }
}
