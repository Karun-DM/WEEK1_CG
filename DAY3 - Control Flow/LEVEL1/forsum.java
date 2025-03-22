import java.util.Scanner;

public class forsum {
    public static void main(String[] args) {
        int sum=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("num?");
        int num=reader.nextInt();
        
        for (int i=0;i<num;i++)
        {
            sum=sum+i;
        }
        System.out.println("total sum is "+sum);
    }
}
