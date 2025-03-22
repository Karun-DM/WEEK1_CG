import java.util.Arrays;
import java.util.Scanner;
public class CompareArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String character=reader.nextLine();
        String characters=reader.nextLine();
        char[] array = new char[character.length()];
        for(int i=0;i<character.length();i++){
            array[i]=character.charAt(i);
        }
        System.out.println(Arrays.toString(array));

        char[] inBuiltarray=characters.toCharArray();
        System.out.println(Arrays.toString(inBuiltarray));
        if(Arrays.equals(array,inBuiltarray)){
            System.out.println("same");
        }
        else{
            System.out.println("diff");
        }


    }
    
}
