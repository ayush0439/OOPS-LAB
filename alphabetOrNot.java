import java.util.*;
public class alphabetOrNot {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char num1=in.next().charAt(0);


        if(((num1>=65)&&(num1<=90))||((num1>=97)&&(num1<=122))){
            System.out.println(" YAY! WE DETECTED AN ALPHABET ");
        }

        else{
            System.out.println(" JEEZ! UNABLE TO DETECT AN ALPHABET ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}