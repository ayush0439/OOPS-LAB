import java.util.*;
public class divisibilityBy5or11 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num1=in.nextInt();


        if((num1%5==0)&&(num1%11==0)){
            System.out.println(" PERFECTLY DIVISIBLE ");
        }

        else{
            System.out.println(" NOT DIVISIBLE ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}
