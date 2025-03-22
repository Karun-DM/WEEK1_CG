import java.util.Scanner;

public class multiple100 {
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     System.out.println("number?");
     int n=reader.nextInt();
     if (n>0 && n<100){
        for(int i=100;i>0;i--){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
     }
    }
}
