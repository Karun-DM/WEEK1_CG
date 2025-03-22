import java.util.Scanner;

public class Compare{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1=reader.nextLine();
        String user2=reader.nextLine();
        boolean value=true;
        if(user1.length()!=user2.length()){
            value = false;
        }

            else{
                for(int i=0;i<user1.length();i++){
                    if(user1.charAt(i)!=user2.charAt(i)){
                        value=false;
                        break;
                    }
                }
            }

            boolean checkStr=(user1.compareTo(user2)==0);
            boolean checkStr1=user1.equals(user2);
            System.out.println(value);
            System.out.println(checkStr);
            System.out.println(checkStr1);
            if(value && checkStr && checkStr1){
                System.out.println("equal");
            }
            else{
                System.out.println("not equal");
            }
           
        }
    }
