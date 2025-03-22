public class ArrayOutOfBOund {
     public static void main(String[] args) {
        int[] a={3,4,5,6,7,8};
        try{
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
       }
    
}
