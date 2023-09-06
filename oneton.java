import java.util.*;
public class oneton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
        int n=in.nextInt();
        int i=1;
        System.out.println("HERE IS YOUR ANSWER:");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
