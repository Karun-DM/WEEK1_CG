import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int numbers=reader.nextInt();
        int[] num= new int[numbers];
        int index=0;
        
        for(int i=1;i<numbers;i++){
             
            if(numbers%i==0){
                num[index++]=i;

            }
        }
        for(int i=0;i<index;i++){
            System.out.println(num[i]+" ");
        }

         

    }
    
}
