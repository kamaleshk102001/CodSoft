package ATMInterface;

import java.util.*;
public class ATM1 {
    


interface ATMOperations{
    void withdrawl();

    void deposit();

    void checkbalance();

    void printreceipt();
}
        /*int balance=10000;
    
        
        int pin=1234;

        

        int TakeAmount=0;

        int AddAmount=0;


        //int password;

        Scanner s=new Scanner(System.in);*/

        public static void main (String[] args) {
            /* code */
            //ATM main=new ATM();

            User mains=new User();
            
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter your password");
            System.out.println(" ");
            int password=s.nextInt();
             s.nextLine();

            if(password==mains.pin){
                System.out.println(" ");
            System.out.println("Enter your name");
            System.out.println(" ");

            String name=s.nextLine();

            System.out.println(" ");
            System.out.println("Welcome"+name);

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
                            mains.checkbalance();
                            break;
                        case 2:
                            mains.deposit();
                            break;
                        case 3:
                            mains.withdrawl();
                            break;
                        case 4:
                            mains.printreceipt();
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
