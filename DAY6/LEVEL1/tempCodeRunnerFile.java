import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text=reader.nextLine();
        String Convertor="";

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a' && ch<='z'){
                Convertor=Convertor+(char)(ch-32);
            }
            else{
                Convertor=Convertor+ch;
        
        }
        
    }
    System.out.println(Convertor);
}
    
}