import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        int[] number=new int[5];
        for(int i=0;i<number.length;i++){
            number[i]=reader.nextInt();
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
    
}
