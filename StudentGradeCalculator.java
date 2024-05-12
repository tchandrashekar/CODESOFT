import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println();
        System.out.println(" **** Welcome to Student Grade Calculator ****");
        System.out.println();
        System.out.print("Enter the number of Subjects : ");
        int numberOfsub =s.nextInt();
        System.out.println();
        int total_marks=0;
        for(int i=1;i<=numberOfsub;i++)
        {
            System.out.print("Enter the subject marks of "+i+" subject : ");
            int marks=s.nextInt();
            
            total_marks=total_marks+marks;
        }
        double average_marks =(double)total_marks/numberOfsub;
        char grade;
        if(average_marks > 90)
        {
            grade='A';
        }
        else if(average_marks > 80 && average_marks <= 90)
        {
            grade='B';
        }
        else if( average_marks > 70 && average_marks <=80)
        {
            grade='C';
        }
        else if( average_marks > 60 && average_marks <=70)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println();
        System.out.println("Total marks obtained is : "+total_marks);
        System.out.println("Average percentage is : " + String.format("%.1f", average_marks) +"%");
        System.out.println("The obtained Grade is : "+grade);
    }
}
