import java.util.*;
public class Sss {
    public static void main(String[] args) {
        int[] array={0,2,6,1,0,0,-1,6,7};
        int index=0;
         
        for(int i=0;i<array.length;i++){
        if(array[i]==0){
            int temp=array[index];
            array[index]=array[i];
            array[i]=temp;
            index++;

        }
        
    }
    System.out.println(Arrays.toString(array));
        
        
    }
    }
    
