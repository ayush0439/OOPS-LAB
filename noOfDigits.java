import java.util.*;
public class noOfDigits {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=in.nextInt();
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        System.out.println("THE DIGIT COUNT IS: " +c);
    }
}
