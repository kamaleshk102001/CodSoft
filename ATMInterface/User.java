package ATMInterface;

import java.util.*;
public  class User implements ATM {
    int balance=10000;
    
        
    int pin=1234;

    

    int TakeAmount=0;

    int AddAmount=0;

    String name;

    //int password;

    Scanner s=new Scanner(System.in);

     public void checkbalance(){
    System.out.println("Your balance is "+balance);
    }

public void deposit(){
    System.out.println("Enter the amount");
    System.out.println(" ");
    AddAmount=s.nextInt();
    balance=AddAmount+balance;
    System.out.println("Amount successfully added");
}

public void withdrawl(){
    System.out.println("Enter TakeAmount");
    System.out.println(" ");
    TakeAmount=s.nextInt();
    if(TakeAmount>balance){
        System.out.println("Wrong amount");
        System.out.println(" ");
        System.out.println("Try less than this amount");
        System.out.println(" ");
    }
    else{
        balance=balance-TakeAmount;
        System.out.println("Amount debited successfully");
    }
}

public void printreceipt(){
    System.out.println(" ");
    System.out.println("Welcome to All in one ATM");
    System.out.println(" ");
    System.out.println("Your balance is"+balance);
    System.out.println(" ");
    System.out.println("Your AddAmount is"+AddAmount);
    System.out.println(" ");
    System.out.println("Your TakeAmount is"+TakeAmount);
}

    
   

    //System.out.println("Enter your password");

    /**
     *
     */
  
    
    //System.out.println("Welcome");
    
    //nextLine();
    public static void main (String[] args) {
        /* code */
        User main=new User();

        //ATM atm=new ATM();
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter your password");
        System.out.println(" ");
        int password=s.nextInt();
         s.nextLine();

        if(password==main.pin){
            System.out.println(" ");
        System.out.println("Enter your name");
        System.out.println(" ");

        main.name=s.next();

        System.out.println(" ");
        System.out.println("Welcome"+" "+main.name);

        while(true){
            System.out.println(" ");
            System.out.println("Enter 1 to check balance");
            System.out.println(" ");
            System.out.println("Enter 2 to deposit amount ");
            System.out.println(" ");
            System.out.println("Enter 3 to withdrawl amount");
            System.out.println(" ");
            System.out.println("Enter 4 to print receipt");
            System.out.println(" ");

            int opt=s.nextInt();
            
            s.nextLine();
            
            //s.nextLine();

            

                switch (opt) {
                    case 1:
                        main.checkbalance();
                        break;
                    case 2:
                        main.deposit();
                        break;
                    case 3:
                        main.withdrawl();
                        break;
                    case 4:
                        main.printreceipt();
                        break;
                    
                }
               if(opt==5){
                System.out.println("Thank you");
                break; 
            }
            }
        
    }
    else{
        System.out.println("Invalid password exists");
    }

}

    
}
