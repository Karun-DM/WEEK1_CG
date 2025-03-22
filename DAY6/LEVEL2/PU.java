public class PU {
    public static void main(String[] args) {
        int[] array={1, 9, 9, 9};
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(i == array.length-1){
                sum += array[i] + 1;
                
            }
            else if(i < array.length-1){
                sum+= array[i];
                sum *= 10;
            }
            
        }
        System.out.println(sum);
    }

    
}
