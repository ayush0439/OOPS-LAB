import java.util.*;
public class negativePositiveZero {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num1=in.nextInt();


        if(num1>0){
            System.out.println(num1 + " IS A POSITIVE INTEGER ");
        }
        else if(num1==0){
            System.out.println(num1 + " IS A ZERO ");
        }
        else{
            System.out.println(num1 + " IS A NEGATIVE INTEGER ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}
