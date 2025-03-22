import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] number=new int[4];
        for(int i=0;i<number.length;i++){
             number[i] = reader.nextInt();

            }
        for (int element:number){
            if(element%2==0){
                System.out.print(element+" even");
            }
            else{
                System.out.print(element+" odd");
            }
        }
        }
    }
    

