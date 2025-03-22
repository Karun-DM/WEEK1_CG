import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] month={ "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"};
        int leap=reader.nextInt();
        int[] day;
        if(leap%400==0 || leap%100!=0 && leap%4==0){
            day=new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        else{
            day=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        }
        int year=reader.nextInt();
        int months=reader.nextInt();
        System.out.println("\n"+months+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int y0 = year - (14 - months) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = months + 12 * ((14 - months) / 12) - 2;
        int firstDay = (1 + x + (31 * m0) / 12) % 7;

        for(int i=0;i<firstDay;i++){
            System.out.print("   ");
        }
        for(int days=1;days<=day[months-1];days++){
            System.out.printf("%3d",days);
            if((firstDay+days)%7==0){
                System.out.println();
            }
           

        }
        System.out.println();

    }
    
}
