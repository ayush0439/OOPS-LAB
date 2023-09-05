import java.util.*;
public class leapYear {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A YEAR");
        int num1=in.nextInt();


        if((num1%4==0)&&(num1%100!=0)||(num1%400==0)){
            System.out.println(" YAY! LEAP YEAR. ");
        }

        else{
            System.out.println(" NOT A LEAP YEAR. ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}
