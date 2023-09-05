import java.util.*;
public class maxBtwThree {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();

        if((num1>num2)&&(num1>num3)){
            System.out.println(num1 + " IS GREATER. ");

        }

        else if((num3>num1)&&(num3>num2)){
            System.out.println(num3 + " IS GREATER. ");

        }
        else if((num2>num1)&&(num2>num3)){
            System.out.println(num2 + " IS GREATER. ");

        }
        else{
            System.out.println(" ALL NUMBERS ARE EQUAL. ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}
