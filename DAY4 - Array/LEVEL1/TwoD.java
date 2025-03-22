import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] number = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                number[i][j]=reader.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(number[i][j]+" ");
            }
            
        }
    }
    
}
