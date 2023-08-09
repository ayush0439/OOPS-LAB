import java.util.*;
public class scannerClass {
    public static void main(String [] Arguments){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO START THE OPERATION");
        int num=obj.nextInt();
        System.out.println("ENTER Palindrome TO CHECK PALINDROME NUMBER");
        System.out.println("ENTER Armstrong TO CHECK ARMSTRONG NUMBER");
        System.out.println("ENTER Even TO CHECK EVEN NUMBER");
        System.out.println("ENTER Prime TO CHECK PRIME NUMBER");
        System.out.println("ENTER YOUR CHOICE");
        String choice=obj.next();
        switch(choice) {
            case "Palindrome": {
                int fake, last, rev = 0;
                fake = num;
                while (fake != 0) {
                    last = fake % 10;
                    rev = (rev * 10) + last;
                    fake = fake / 10;
                }
                if (fake == num)
                    System.out.println("PALINDROME NUMBER");
                else
                    System.out.println("NOT A PALINDROME NUMBER");
                break;
            }
            case "Armstrong": {
                int fake2, fake1, count = 0, check = 0;
                fake2 = num;
                fake1 = num;
                while (fake2 != 0) {
                    count++;
                    fake2 = fake2 / 10;
                }
                while (fake1 != 0) {
                    int last = fake1 % 10;
                    check = check + (int) (Math.pow(last, count));
                    fake1 = fake1 / 10;
                }
                if (check == num)
                    System.out.println("ARMSTRONG NUMBER");
                else
                    System.out.println("NOT AN ARMSTRONG NUMBER");

            break;
            }
            case "Even": {

                if (num % 2 == 0)
                    System.out.println("EVEN NUMBER");
                else
                    System.out.println("ODD NUMBER");
            break;
            }
            case "Prime": {
                int fake3, count1 = 0;
                fake3 = num;
                for (int i = 1; i <= fake3; i++) {
                    if (fake3 % i == 0)
                        count1++;
                    if (count1 == 2)
                        System.out.println("PRIME NUMBER");
                    else
                        System.out.println("NOT A PRIME NUMBER");
                break;
                }


            }
            default:
                System.out.println("WRONG CHOICE");
        }




    }
}
