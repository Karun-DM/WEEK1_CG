import java.util.Arrays;

public class Word {
    public static void main(String[] args) {
        int[] a={5,8,12,34,80};
        int start = a[0];
        int end = a[a.length-1];
        for(int i = start+1; i<end;i++){
            int find = 0;
            for(int j =0; j<a.length;j++){
                if (i == a[j]) {
                    find = 1;
                }
            }
            if(find != 1){
                System.out.print(i+" ");
            }
        }
    }
    
}
