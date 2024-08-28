
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator");
        System.out.println("Enter the number of subjects");
        int numberOfSubjects=sc.nextInt();
        int sum=0;
        for(int i=0;i<numberOfSubjects;i++){
            System.out.println("Enter the marks of Subject"+ (i+1)+" out of 100");
            sum+=sc.nextInt();
        }
        float percentage=(sum/numberOfSubjects);
        System.out.print("Your total marks is: "+sum+",\nYour average percentage is: "+ percentage+"%"+ ", \nAnd your grade is :");
        if (percentage>=91) {
            System.out.print("A1");
        }
        else if(percentage>=81){
            System.out.print("A2");
        }
        else if(percentage>=71){
            System.out.print("B1");
        }
        else if(percentage>=61){
            System.out.print("B2");
        }
        else if(percentage>=51){
            System.out.print("C1");
        }
        else if(percentage>=41){
            System.out.print("C2");
        }
        else if(percentage>=33){
            System.out.print("D1");
        }
        else {
            System.out.print("E");
        }
        sc.close();
}
}

