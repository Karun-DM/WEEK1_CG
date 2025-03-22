import java.util.Scanner;

public class fizzBuzzs{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("enter the no");
        int num=reader.nextInt();
        
        for (i=1;i<num;i++){
            
            if (i%5==0 && i%3==0){
                System.out.println(i+" fizzbuzz");
            }
            else if(i%5==0){
                System.out.println(i+" buzz");
            }
            else if(i%3==0){
                System.out.println(i+" fizz");
            }
            else{
                System.out.println(i+" none");
            }

        }
    }

}