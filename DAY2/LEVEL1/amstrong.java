import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the number");
        int num=reader.nextInt();
        int temp,rem,rev;
        double result=0;
        temp = num;
        int length= String.valueOf(temp).length();
        
        while (temp>0){
            rem = temp%10;
            
            result=result+Math.pow(rem,length);
            temp=temp/10;
        }
        if (result==num){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not");
        }
    }
    
}
