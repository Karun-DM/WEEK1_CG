import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum=0;
        double[] arrays=new double[11];
        for(int i =0;i<arrays.length;i++){
            arrays[i]=reader.nextInt();
            sum=sum+arrays[i];
        }
        double mean=sum/arrays.length;
        System.out.println(sum);
        System.out.println(mean);
    }
}
