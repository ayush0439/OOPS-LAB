import java.util.*;
public class sumofnatodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
        int n=in.nextInt();
        int i=1,sum=0;
        System.out.println("HERE IS YOUR ANSWER:");
        while(i<=n){
            if(i%2!=0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("THE ANSWER IS = " +sum);
    }
}

