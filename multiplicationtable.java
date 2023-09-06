import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF YOUR DESIRED CHOICE");
        int n= in.nextInt();
        int i;
        for(i=1;i<=10;i++){
            int product=i*n;
            System.out.println(n +" X " +i+ " = " + product);
        }
    }
}
