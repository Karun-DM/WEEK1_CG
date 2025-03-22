import java.util.Scanner;

public class LargestSmallest {
    public static int large(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }
        else if(b>c&&b>a){
            return b;
        }
        else{
            return c;
        }

    }
    public static int small(int a,int b,int c){
        if(a<b&&a<c){
            return a;
        }
        else if(b<a&&b<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        int d=large(a,b,c);
        int e=small(a,b,c);
        System.out.println(d+" largest");
        System.out.println(e+" smallest");

    }
    
}
