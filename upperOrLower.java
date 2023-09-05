import java.util.*;
public class upperOrLower {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char num1=in.next().charAt(0);


        if((num1>=65)&&(num1<=90)){
            System.out.println(" YAY! WE FOUND AN UPPERCASE ALPHABET.");
        }

        else if((num1>=97)&&(num1<=122)){
            System.out.println(" YAY! WE FOUND A LOWERCASE ALPHABET. ");
        }
        else{
            System.out.println(" JEEZ! UNABLE TO DETECT ANY ALPHABET. ");

        }        System.out.println(" FAREWELL USER! ");
    }
}
