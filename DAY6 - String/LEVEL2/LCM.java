import java.util.Scanner;

public class LCM{
    public static void main(String[] args) {
        int max=0;
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        while(true){
            if(max%a==0 && max%b==0){
                
               
                System.out.println(max);
                break;
            }
            max++;
        }
        int gcd=(a*b)/max;
        System.out.println(gcd);
     
    }
    
}