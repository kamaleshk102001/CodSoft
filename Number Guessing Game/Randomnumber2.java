import java.util.Random;
import java.util.Scanner;

public class Randomnumber2 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        Random random=new Random();

         int num=random.nextInt(6);

       
        
        //for(int i=1;i<=5;i++){
        int no=0;
        while(no<6){
        if(num==no){
            System.out.println("guess is correct");
            break;
        }
        System.out.println("Enter Number");
        no=s.nextInt();
    }
    
        //}
    }
}