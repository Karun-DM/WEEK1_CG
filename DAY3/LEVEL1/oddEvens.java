import java.util.Scanner;

public class oddEvens {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("print n?");
        int n =reader.nextInt();
        for(int i=1;i<n;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
            System.out.println("odd number is ");
            for(i=1;i<n;i++){

            
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        }
    }
    
}
