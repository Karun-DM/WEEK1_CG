import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("number???");
        int number = reader.nextInt();
        System.out.println("power???");
        int power = reader.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*number;
        }
        System.out.println(result);

    }
}
