import java.util.Scanner;
public class countdownFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("counter ?");
        int counter = reader.nextInt();
        for(int i=counter;i >= 1;i--){
            System.out.println(i);
        }
    }
    
}
