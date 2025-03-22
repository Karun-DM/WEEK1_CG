public class powerWhile {
    public static void main(String[] args) {
        int number=6;
        int power=3;
        int result=1;
        while (power>0) {
            result=result*number;
            power--;

        }
        
        System.out.println(result);
    }
}
