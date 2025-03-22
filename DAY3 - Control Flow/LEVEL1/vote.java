import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your age");
        int age = reader.nextInt();
        if(age>=18){
            System.out.printf("person's age is %d so eligible to vote",age);
        }
        else{
            System.out.printf("person's age is %d so not eligible to vote ",age);
        }
    }
}
