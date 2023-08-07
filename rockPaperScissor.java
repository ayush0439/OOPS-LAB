import java.util.*;
public class rockPaperScissor {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        int user = 0, cpu = 0, userChoice,compChoice,n=5;
        for(int i=1;i<=n;i++){
         compChoice = (int) ((Math.random() * 3) + 1);
        System.out.println("ENTER 1 FOR ROCK, 2 FOR PAPER AND 3 FOR SCISSOR");
         userChoice = in.nextInt();

         System.out.println("COMPUTER CHOOSES  " +compChoice);

        if (compChoice == 1 && userChoice == 2) {
            user++;
        } else if (compChoice == 2 && userChoice == 3) {
            user++;
        } else if (compChoice == 3 && userChoice == 1) {
            user++;
        }
        else if(compChoice==userChoice){
            n++;
        }else {
            cpu++;
        }
    }
        if(user>cpu)
            System.out.println("USER WON");
        else
            System.out.println("COMPUTER WON");
    }
}
