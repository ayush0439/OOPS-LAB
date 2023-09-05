import java.util.*;
public class weekDays {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER 1 FOR SUNDAY");
        System.out.println("ENTER 2 FOR MONDAY");
        System.out.println("ENTER 3 FOR TUESDAY");
        System.out.println("ENTER 4 FOR WEDNESDAY");
        System.out.println("ENTER 5 FOR THURSDAY");
        System.out.println("ENTER 6 FOR FRIDAY");
        System.out.println("ENTER 7 FOR SATURDAY");
        int num1=in.nextInt();


        if(num1==1)
            System.out.println("IT IS SUNDAY");
        else if(num1==2)
            System.out.println("IT IS MONDAY");
        else if(num1==3)
            System.out.println("IT IS TUESDAY");
        else if(num1==4)
            System.out.println("IT IS WEDNESDAY");
        else if(num1==5)
            System.out.println("IT IS THURSDAY");
        else if(num1==6)
            System.out.println("IT IS FRIDAY");
        else if(num1==7)
            System.out.println("IT IS SATURDAY");

        System.out.println(" FAREWELL USER! ");
    }
}


