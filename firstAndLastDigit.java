public class firstAndLastDigit {
    public static void main(String [] Args){
        int num = 152,last,rev=0,first,last1;
        int fake=num;
        while(fake!=0){
            last=fake%10;
            rev=(rev*10)+last;
            fake=fake/10;

        }
        first=rev%10;
        last1=num%10;
        System.out.println("FIRST DIGIT = " +first);
        System.out.println("LAST DIGIT = " +last1);

    }
}



