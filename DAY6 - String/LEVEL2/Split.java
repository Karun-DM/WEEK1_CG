import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text=reader.nextLine();
        String word="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);

            if(ch!=' '){
                word=word+ch;

            }
            else{
                
                System.out.println(word);
                word=" ";
              
            }
        }
        if(!word.isEmpty()){
            System.out.println(word);
        }
        

    }
    
}
