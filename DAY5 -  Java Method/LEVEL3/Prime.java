import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n=reader.nextInt();
        int limit=reader.nextInt();
        int flag=0;
        for(int i=2;i<limit;i++){
            if(n%i==0){
                flag=1;
            }


        }
        if(flag==1){
            
        }
    }
    
}
