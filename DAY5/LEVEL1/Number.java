import java.util.Scanner;

public class Number {
    public static int check(int x){
        if(x>0){
            return 1;
        }
        else if(x<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int c=reader.nextInt();
        int a=check(c);
        if(a==1){
            System.out.println("positive");
        }
        else if(a==-1){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    
}
