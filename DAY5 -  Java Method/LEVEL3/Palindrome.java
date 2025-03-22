 
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void reverse(int[] array){
        int left=0;
        int right=array.length-1;

        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;

    }
    System.out.println(Arrays.toString(array));
}
public static boolean Palindrome(int[] array){
    int left=0;
    int right=array.length-1;
    while(left<right){
        if(array[left]!=array[right]){
            return false;
        }
        left++;
        right--;
        
    }
    return true;
}
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        
        for(int i=0;i<5;i++){
            array[i]=reader.nextInt();

        }
        reverse(array);
        Palindrome(array);
        if(Palindrome(array)){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
        for(int i=0;i<5;i++){
            if (array[i]==0){
                System.out.println("duck number");
                break;
            }
            
        }
        

        }
    }
        
        
        
        
    
    

