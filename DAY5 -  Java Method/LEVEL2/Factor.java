import java.util.Scanner;

public class Factor{
    public static void arraydisplay(int number,int[] num){
        for(int i=0;i<number;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int num[]=new int[number];
        for(int i=0;i<number;i++){
            num[i]=reader.nextInt();
        }
        arraydisplay(number,num);
        
        }
    }
