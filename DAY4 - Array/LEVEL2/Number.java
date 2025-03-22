import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int[] marks=new int[number];
        double percentage=0;
        String[] grade = new String[number];
        double total=0;

        for(int i=0;i<number;i++){
            marks[i]=reader.nextInt();
        }
        
        for(int i=0;i<number;i++){
            total=total+marks[i];
        }
        percentage=total/number;
        System.out.println(percentage);

    }
}
