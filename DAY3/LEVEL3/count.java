import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("type any integer");
        int integer=reader.nextInt();
        int count=0;
        
        while (integer>0){
            count=count+1;
            integer=integer/10;

        }
        System.out.println(count);
    }
    
}
