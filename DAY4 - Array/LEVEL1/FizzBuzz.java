import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] number = new int[20];
        for (int i=0;i<number.length;i++){
            number[i]=reader.nextInt();
        }
        for(int i=0;i<number.length;i++){
            if(number[i]%5==0 && number[i]%3==0){
                System.out.println("buzz fizz");
            }
            else if(number[i]%5==0){
                System.out.println("fizz");
            }
            else if(number[i]%3==0){
                System.out.println("buzz");
            }
            else{
                System.out.println("none");
            }
        }
    }
    
}
