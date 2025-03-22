public class UpperClassOne {
    public static void main(String[] args) {
        String text=" ";
        String character= "karuN IIIo";
        for(int i=0;i<character.length();i++){
            char c=character.charAt(i);
            if(c>='a'&&c<='z'){
                text=text+(char)(c-32);
            }
            else{
                text=text+c;
            }
        }
        System.out.println(text);
    }
    
}
