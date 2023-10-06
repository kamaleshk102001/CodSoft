import java.util.*;
public class StudentGradeCalc{
    //private static double avg;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        
        double avg = marks/5;
        
        if (avg>=90)
        {
            System.out.println("Grade:A");
        }
        else if (avg>=80){
            System.out.println("Grade:B");
        } 
        else if (avg>=75) {
           System.out.println("Grade:C"); 
        }
        else if (avg>=60) {
            System.out.println("Grade:D");
        }
        else{
            System.out.println("You are failed");
        }
    }
}

