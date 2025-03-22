import java.util.Scanner;

public class greattestfactor {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("write a no");
        int a = reader.nextInt();
        int i =2;
        int fact =0 ;
        while (i<a){
            if (a%i==0){
                fact=i;
            }
            i++;

        }
        System.out.println(fact);
    }
}