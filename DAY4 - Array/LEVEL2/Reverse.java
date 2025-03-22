import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rem=0;
        int digit=0;
        int number=reader.nextInt();
        int temp=number;
        int count=0;
        while(temp>0){
            
            temp=temp/10;
            count++;
        }
        System.out.println(count);
        while(number>0){
            rem=number%10;
            digit=digit*10+rem;
            number=number/10;

        }
        System.out.println(digit);
        

        int[] array=new int[count];
        for(int i=0;i<count;i++){
            array[i]=digit%10;
            digit=digit/10;
            System.out.println(array[i]);

        }
        

    }
}





        
