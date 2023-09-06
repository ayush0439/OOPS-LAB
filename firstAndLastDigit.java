import java.util.*;
public class firstAndLastDigit {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=in.nextInt();
        int c=0;
        int t=n;
        int last=n%10;
        while(n>0){
            c++;
            n=n/10;
        }
        int surr=(int)(java.lang.Math.pow(10,c-1));
        int first= t/surr;

        System.out.println(c);
        System.out.println("THE FIRST DIGIT IS: " +first);
        System.out.println("THE LAST DIGIT IS: " +last);
    }
}