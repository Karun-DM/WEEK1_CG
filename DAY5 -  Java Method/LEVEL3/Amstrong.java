import java.util.Scanner;

public class Amstrong {
    public static int find(int a,int b){
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=sum+(int)Math.pow(digit,b);
            a=a/10;

        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int temp=a;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
         
        Amstrong find = new Amstrong();
        int result = find(temp,count);
        if(result==temp){
            System.out.println("amstrong");
        }
        
    }
    
}
