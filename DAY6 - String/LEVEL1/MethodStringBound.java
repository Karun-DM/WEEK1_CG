public class MethodStringBound {
    public static void Throwexception(String text){
         text.charAt(30);
    }
    public static void Handleexception(String text){
        try{
            for(int i=0;i<text.length();i++){
                System.out.println(text.charAt(10));
            }
        }
        catch(StringIndexOutOfBoundsException e){
            
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String text="karun";
        
        Handleexception(text);
        Throwexception(text);

    }
    
}
