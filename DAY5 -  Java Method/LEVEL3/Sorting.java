import java.util.Arrays;

public class Sorting {
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
    public static void largestAndSecond(int[] array){
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
    public static void main(String[] args) {
        int[] array={34,45,24,21,22,90};
        Arrays.sort(array);
        reverse(array);
        largestAndSecond(array);
        
    }
    
}
