import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] number=new int[5];
        int sum=0;
        for(int i=0;i<number.length;i++){
            number[i]=reader.nextInt();
            if (number[i]==0){
                break;
            }
            sum=sum+number[i];
        }
        System.out.println(sum);

    }
}
