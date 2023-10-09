 package ATMInterface;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    int pin=1234;
	    int balance=1000;
	    
	    int TakeAmount=0;
	    int AddAmount=0;
	    
	    String name;
	    
	    Scanner s=new Scanner(System.in);
	    
	     System.out.println("Welcome to Swiss Atm");
	     
	     System.out.println("Enter your password");
	    
	    int password=s.nextInt();
	    
	    if(password==pin){
	       
	        
	        System.out.println("Enter your name");
	        
	        name=s.next();
	        
	        System.out.println("Welcome"+name);
	        
	        while(true){
	            System.out.println("Enter 1 to check balance");
	            System.out.println("Enter 2 to AddAmount");
	            System.out.println("Enter 3 to TakeAmount");
	            System.out.println("Enter 4 to print receipt");
	            
	           int option=s.nextInt();
	           
	           switch(option){
	               case 1:
	                   System.out.println("Your balance is"+balance);
	                   break;
	                   
	               case 2:
	                   System.out.println("Enter your deposit amount");
	                   AddAmount=s.nextInt();
	                   System.out.println("Amount successfully added");
	                   balance=AddAmount+balance;
	                   break;
	                   
	               case 3:
	                   System.out.println("Enter your withdrawal amount");
	                   TakeAmount=s.nextInt();
	                   if(TakeAmount>balance){
	                       System.out.println("Insufficient balance");
	                       System.out.println("Try less than the amount you enter now");
	                   }
	                   else{
	                   System.out.println("Withdrawl done successfully");
	                   balance=balance-TakeAmount;
	                   }
	                   break;
	                   
	               case 4:
	                   System.out.println("Welcome to our ATM");
	                   System.out.println("Your balance is"+balance);
	                   System.out.println("The TakeAmount is"+TakeAmount);
	                   System.out.println("The AddAmount is"+AddAmount);
	                   break;
	               
	           }
	           if(option==5){
	               System.out.println("Thank you");
	               break;
	           }
	            
	        }
	    }
	    else{
		  System.out.println("Wrong Pin entered");
		  System.out.println("Enter correct pin");
	    }
	}
}
