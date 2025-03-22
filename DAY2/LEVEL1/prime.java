import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type any number");
        int a=reader.nextInt();
        int is_prime = 0;
        for(int i=2;i<a;i++){
            if (a%i==0){
                is_prime = 1;
                break;
                }
        
        }
        if(is_prime==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
    
}
