import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] number = new int[4];
        
        for(int i=0;i<number.length;i++){
            number[i]=reader.nextInt();
        }
        int min=number[0];
        for(int i=0;i<number.length;i++){
            if (min>number[i]){
                min=number[i];
            }
           
        }
        System.out.println(min);
    }
    
}
