public class reverseANumber {
    public static void main(String [] Args){
        int num = 152,last,rev=0;
        int fake=num;
        while(fake!=0){
             last=fake%10;
            rev=(rev*10)+last;
            fake=fake/10;

        }
        System.out.println("REVERSE IS = " + rev);
        }
}
