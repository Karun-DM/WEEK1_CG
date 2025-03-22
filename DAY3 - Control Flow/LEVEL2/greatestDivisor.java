import java.util.Scanner;

public class greatestDivisor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any number");
        int n=reader.nextInt();
        int fact = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                fact = i;
                }
        }
        System.out.println(fact); 
    }
    
}
