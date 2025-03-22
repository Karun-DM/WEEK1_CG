import java.util.Scanner;

public class FactorJ {
    public static void sum(int total,int[] array){
        for(int i=0;i<array.length;i++){
        total=total+array[i];
        
        }
        System.out.print("\n"+total);
    }
    public static void multi(int mult,int[] array){
        for(int i=0;i<array.length;i++){
            mult=mult*array[i];
            
        }
        System.out.print("\n"+mult);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count=0;
        int number=reader.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                 
                count++;
            }
        }
        System.out.println(count);
        int[] array=new int[count];
        int index=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                array[index++]=i;
                
            }

        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int total=0;
        sum(total,array);
        int mult=1;
        multi(mult,array);
    }
    
}
