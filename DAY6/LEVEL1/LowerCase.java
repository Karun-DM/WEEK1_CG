import java.util.Scanner;

public class LowerCase {
    public static String Convert(char ch,String convertor){
        if(ch>='A' && ch<='Z'){
            convertor=convertor+(char)(ch+32);
        }
        else{
            convertor=convertor+ch;
        }
        
    
    return convertor;

}
public static String Coverts(String text){
    String s=text.toLowerCase();
    return s;
}
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text=reader.nextLine();
        String convertor="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            System.out.print( Convert(ch,convertor));
        }
        System.out.println("\n"+Coverts(text));
   
    
}
}
