/*
?Mini-Project
*Let’s create a project where we are trying to ask the user to guess a randomly generated number.
!The number is in the range of 1 to 100.

*If the user guesses a number that is greater, we print “The number is too large”.
*If the user guesses a number that is smaller, we print “The number is too small”.
*If the user is able to correctly guess the number, then we print “Correct Number!”.

*At the end we will print the number that was generated by our Math library.

 */



import java.util.Scanner;
public class guess {
    public static void main(String[] args){
        //Mini project 
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess My Number(1-100) : ");
            userNumber = sc.nextInt();
            
            if(userNumber == myNumber){
            System.out.println("🥇WOOOOOHOOOO......👍 CORRECT NUMBER!!!!!!!🏆");
            break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large.");
            }
            else{
                System.out.println("Your number is too low.");
            }
        }while(userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}