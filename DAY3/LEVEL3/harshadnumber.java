import java.util.Scanner;

public class harshadnumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any no");
        int no = reader.nextInt();
        int temp = no;
        int rem=0;
        int sum=0;
        while(no>0){
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        if (temp%sum==0){
            System.out.println("harshad");
        }
        else{
            System.out.println("no");
        }
    }
}
