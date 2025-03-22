import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers=new int[6];
        int[] even= new int[6];
        int[] odd = new int[6];
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<numbers.length;i++){
            numbers[i]=reader.nextInt();
        }
        for (int i = 0; i<numbers.length;i++){
            if(numbers[i]%2==0){
                even[evencount] = numbers[i];
                evencount++;
                
            }
            else{
                odd[oddcount]= numbers[i];
                oddcount++;
            }
        }
        System.out.println("even numbers are :");
        for(int i=0;i<evencount;i++){

                System.out.print(even[i] + " ");
        }
        System.out.println("\nodd numbers are:");
        for(int i=0;i<oddcount;i++){
            System.out.print(odd[i]+" ");
        }
    }
    
}
