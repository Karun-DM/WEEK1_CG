import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        double total=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any number");
        int num=reader.nextInt();
        while (num!=0){
            
            total=total+num;
            num=reader.nextInt();
        }
        System.out.println(total);
    }
}
