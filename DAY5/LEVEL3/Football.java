import java.lang.reflect.Array;
import java.util.Scanner;

public class Football{
    public static void display(int[] array){
        for (int i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void add(int total,int[] array){
        for(int i=0;i<5;i++){
            total=total+array[i];
           
        }
        System.out.println("\n"+total);
    }
    public static void mean(int total,int length){
        double mean=(double)total/length;
        System.out.println(mean);
    }
    public static void tallest(int max){
        
        System.out.println(max);
    }
    public static void smallest(int min){
        
        System.out.println(min);
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0;i<5;i++){
            array[i]=reader.nextInt();
        }
        display(array);

        int total=0;
        add(total,array);
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+array[i];
           
        }
       
         

        mean(sum,array.length);
        int max=array[0];
        for (int i=0;i<5;i++)
        {
            if(max<array[i]){
            max=array[i];
            }
        }
        tallest(max);
        int min=array[0];
        for(int i=0;i<5;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        smallest(min);
    }
}