import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int temp=number;
        int[] freq = new int[10];
        while(temp>0){
            int digit=temp%10;
            freq[digit]++;
            temp=temp/10;
        }
        for(int i=0;i<=10;i++){
            System.out.println(i+" "+freq[i]);

        }
    }
    
}
