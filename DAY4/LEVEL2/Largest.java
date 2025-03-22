import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[4];
        
        for(int i=0;i<array.length;i++){
            array[i]=reader.nextInt();
        }
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
    
}
