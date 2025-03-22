public class NullPointerExceptio {
    public static void main(String[] args) {
        String text=null;
        try{
            System.out.println(text.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());

        }
        String character = null;
        if(character!=null){
            System.out.println("ok");
        }
        else{
            System.out.println("wrong input");

        }
    }
    
}
