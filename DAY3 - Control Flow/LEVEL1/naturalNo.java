import java.util.Scanner;
public class naturalno {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type any number");
        int num= reader.nextInt();
        if (num>0){
            double sum=(num*(num+1))/2;
            System.out.println("natural no is "+sum);
        }
        else
        {
            System.out.println("not natural no");
        }
    }
}

