import java.util.*;
public class tableOfaNumber {
    public static void main(String [] Args){
        Scanner in = new  Scanner(System.in);
        int ans=0;
        System.out.println("ENTER A NUMBER TO PRINT ITS TABLE");
        int num=in.nextInt();
        for(int i=1;i<=10;i++){
            ans=num*i;
            System.out.println(num + " X " + i+ " = " + ans);
        }

    }
}
