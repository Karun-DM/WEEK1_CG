import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any number");
        int num = reader.nextInt();
        if (num>0){
            System.out.println(num + " is positive no");
        }
        else if(num<0){
            System.out.println(num + " is negative no");
        }
        else{
            System.out.println(" its zero");
        }
    }
    
}
