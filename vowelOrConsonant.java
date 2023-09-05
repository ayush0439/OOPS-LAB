import java.util.*;
public class vowelOrConsonant {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char num1=in.next().charAt(0);


        if((num1=='a')||(num1=='A')||(num1=='e')||(num1=='E')||(num1=='i')||(num1=='I')||(num1=='o')||(num1=='O')||
                (num1=='u')||(num1=='U')){
            System.out.println(" YAY! WE DETECTED A VOWEL ");
        }

        else{
            System.out.println(" JEEZ! UNABLE TO DETECT A VOWEL, MUST BE A CONSONANT ");
        }
        System.out.println(" FAREWELL USER! ");
    }
}
