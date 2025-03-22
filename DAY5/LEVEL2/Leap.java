import java.util.Scanner;

public class Leap {
    public static void Leapyr(int a){
        if(a%400==0 || (a%100!=0 && a%4==0)){
            System.out.println("leap");
        }
        else{
            System.out.println("not");
        }

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year=reader.nextInt();
        Leapyr(year);
    }
    
}
