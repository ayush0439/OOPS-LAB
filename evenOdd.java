import java.util.*;
public class evenOdd {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num1=in.nextInt();


        if(num1%2==0){
            System.out.println(" PERFECTLY DIVISIBLE ");
        }

        else{
            System.out.println(" NOT DIVISIBLE ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}

