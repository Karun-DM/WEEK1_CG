import java.util.*;
public class Sum {
    public static int sums(int numb,int sum){
        for(int i=0;i<=numb;i++){
            sum=sum+i;
        }
        return sum;

    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int sum=0;
        int c=sums(number,sum);
        System.out.println(c);



    }
    
}
