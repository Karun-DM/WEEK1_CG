import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m=reader.nextInt();
        int d=reader.nextInt();
        int y=reader.nextInt();
        int y0,m0,d0,x;
        y0=y-(14-m)/12;
        x=y0+(y0/4)-(y0/100)+(y0/400);
        m0=m+12*((14-m)/12)-2;
        d0=(d+x+31*m0/12)%7;
        System.out.println(d0);

    }
    
}
