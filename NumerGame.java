import java.util.Random;
import java.util.Scanner;


public class NumerGame {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        boolean play=true;
        while(play)
        {
            System.out.println(" ***  Welcome to the Number guessing game  ***");
            System.out.println();
            System.out.println("----  System chooses a random number with a range of 1-100 ,try to guess that number ----");
            System.out.println();
            int random_number = r.nextInt(100)+1;
            int attemps = 1;
            boolean guessed_number = false;
            System.out.println("Number of attemps you want try guessing a number");
            int numberOfattemps =s.nextInt();
            while(!guessed_number && attemps <= numberOfattemps)
            {
                System.out.println("Enter the number");
                int user_number =s.nextInt();
                if(user_number == random_number)
                {
                    System.out.println("Congratulations  you guessed the correct number");
                    guessed_number=true;
                }
                else if(user_number > random_number)
                {
                    System.out.println("Guessed number is to high");
                }
                else
                {
                    System.out.println("Guessed number is to low");
                }
                attemps++;
            }
            if(!guessed_number)
            {
                System.err.println("you exceeded the number of attempts , the number is"+ random_number);
            }

            System.out.println("are you want to continue playing (YES/NO)");
            String choice=s.next();
            if(choice.equals("YES"))
            {
                play=true;
            }
            else{
                play=false;
            }

        }
        System.out.println("Thank You for playing the game");
    }

    
}   