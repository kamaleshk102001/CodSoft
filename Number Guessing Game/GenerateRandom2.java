import java.util.*;
public class GenerateRandom2 {
    public static void getRandom(){
    Random rand=new Random();

    int randomNum=rand.nextInt(15);

    guess(randomNum);
}



public static void main(String[]args){
    getRandom();
}

public static void guess(int randomNum){
    Scanner s=new Scanner(System.in);
    System.out.println("");

    System.out.println("Welcome to number guessing game");

    System.out.println(" ");

    System.out.println("Guess the number");

    int guess=s.nextInt();

    System.out.println(" ");



    while(guess<0||guess>14){
        System.out.println("Guess number 0-14");

        guess=s.nextInt();

        System.out.println(" ");
    }
    int attempts=0;

    //int random=getRandom();
    while(guess!=randomNum){
        attempts++;
        System.out.println("Your guess is wrong");
        System.out.println("Guess Again");

        System.out.println();

        guess=s.nextInt();
        
        while(guess<0||guess>14){
        System.out.println("Guess number 0-14");

        guess=s.nextInt();

        System.out.println(" ");

    }
     }

     if(attempts>5)
       getRandom();

       System.out.println("Wrong tries are"+attempts);

     System.out.println("You won in this game");
     System.out.println("Wrong tries are"+attempts);

     System.out.println(" ");

     System.out.println("Enter 1 to play other game");
     System.out.println("Enter 0 to exit");

     int choice=s.nextInt();

     if(choice==1)
       getRandom();
     else
       return;

    }

}


