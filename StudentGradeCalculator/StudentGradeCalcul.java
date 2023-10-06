package StudentGradeCalculator;

import java.util.*;
public class StudentGradeCalcul {
    public static void main(String[] args) {
        generateMarks();
    }

    private static void generateMarks() {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        s.nextLine();

        int[]mark=new int[n];

        String sub;

        for(int i=0;i<n;i++){
            //System.out.println(" ");
            System.out.println("Enter Subject");
             sub=s.nextLine();
            System.out.println(" ");
            System.out.println(sub);
            
            System.out.println(" ");
            mark[i]=s.nextInt();
            System.out.println(" ");
            System.out.println(mark[i]);

            s.nextLine();
        }
        
        int totalmarks=0;
        for(int i=0;i<mark.length;i++){
            System.out.println(" ");
           totalmarks=mark[i]+totalmarks;
        }
        //findgrade(totalmarks);

        int avg=totalmarks/n;

       findgrade(totalmarks,avg);
    }

    private static void findgrade(int totalmarks,int  avg) {
        String grade;
        if(avg>=90){
            grade="O. You are passed with distinction";
        }
        else if(avg>=75){
            grade="A. You have scored well";
        }
        else if(avg>=65){
            grade="B. You have score above average";
        }
        else if(avg>=45){
            grade="C. You have an average score";
        }
        else{
            grade="C- and you are failed";
        }
        
        System.out.println(" ");
        System.out.println("totalmarks is"+" "+totalmarks+"and the average is"+" "+avg+" ");
        
        System.out.println(" ");
        System.out.println("Your grade is"+grade);
    }
}
