import java.util.*;
public class evenbtw1to100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i=1;
        System.out.println("HERE IS YOUR ANSWER:");
        while(i<=100){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}