import java.util.Scanner;

public class whilesum {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("num?");
        int num=reader.nextInt();
        int sum=0;
        while (num>0){
            sum=sum+num;
            num--;
        }
        System.out.println(sum);
    }
    
}
