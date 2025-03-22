import java.util.Scanner;
public class countdown {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("print counter");
        int counter = reader.nextInt();
        while (counter>=1){
            System.out.println(counter);
            counter--;
        }
    }
}
