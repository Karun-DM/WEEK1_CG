import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String character=reader.nextLine();
        int startIndex=reader.nextInt();
        int endIndex=reader.nextInt();
        String manualSubString="";
        for(int i=startIndex;i<endIndex;i++){
            manualSubString=manualSubString+character.charAt(i);

        }
        System.out.println(manualSubString);
        String inBuilString=character.substring(startIndex,endIndex);
        System.out.println(inBuilString);
        if(manualSubString.equals(inBuilString)){
            System.out.println("equal");
        }
        else{
            System.out.println("no");
        }

    }
    
}
