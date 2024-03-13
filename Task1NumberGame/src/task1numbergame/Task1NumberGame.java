
package task1numbergame;


import java.util.*;
public class Task1NumberGame {

    
    public static void main(String[] args) {
        
        int number;
        int guess;
        int result=0;
        Random random = new Random();
        number = random.nextInt(100);
        System.out.println("Generated Number is:"+ number);
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            guess = sc.nextInt();
            result ++;
            
            if(guess > number)
            {
                System.out.println("TOO High try again");
            }
            else if (guess < number)
            {
                System.out.println("TOO Low try again");
            }
            else
            {
                System.out.println("Correct !! you got it in guesses!"+ guess);
            }
        }
        while(guess!= number);
        
    }
}
    

