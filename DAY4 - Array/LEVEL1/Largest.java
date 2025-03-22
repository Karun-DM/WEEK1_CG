import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] number=new int[5];
        for(int i=0;i<number.length;i++){
            number[i]=reader.nextInt();


            }
        int max=number[0];
        for(int i=0;i<number.length;i++){
             
            if(max<number[i]){
                max=number[i];
            }
           
        }
        System.out.println(max);

        
    }
}
