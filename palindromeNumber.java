public class palindromeNumber {
    public static void main(String [] Args){
        int num = 152,last,rev=0;
        int fake=num;
        while(fake!=0){
            last=fake%10;
            rev=(rev*10)+last;
            fake=fake/10;

        }
        if(rev==num)
            System.out.println("PALINDROME NUMBER");
        else
            System.out.println(" NOT A PALINDROME NUMBER");
    }
}

