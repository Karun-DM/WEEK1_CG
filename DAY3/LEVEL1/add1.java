import java.util.Scanner;

public class add1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("print num");
        int num=reader.nextInt();
        int total=0;
        while (true) {
            total=total+num;
            num=reader.nextInt();
            if (num<=0){
                break;
            }
            
        }
        System.out.println(total);
    }
    
}
