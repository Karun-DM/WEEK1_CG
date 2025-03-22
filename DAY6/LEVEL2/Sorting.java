import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array={1,4,3,2,6};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;


                }

            }
           

            
        }
        System.out.println(Arrays.toString(array));
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        int total=0;
        for(int i=1;i<=6;i++){
            total=total+i;
        }
         
        int result=total-sum;
        System.out.println(result);
        
    }

       
    }
    

