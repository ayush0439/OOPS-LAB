import java.util.*;
public class maxNumber {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int num1=in.nextInt();
        int num2=in.nextInt();

        if(num1>num2){
            System.out.println(num1 + " IS GREATER THAN " + num2);
        }
        else if(num1==num2){
            System.out.println(num1 + " AND " + num2 + " ARE EQUAL.");
        }
        else{
            System.out.println(num2 + " IS GREATER THAN " + num1);
        }
        System.out.println(" FAREWELL USER! ");
    }
}

