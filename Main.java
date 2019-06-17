import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    System.out.println("Welcome to the Grade Calculator");
    System.out.println("Please Enter Grades for the Homework");
    System.out.print("HW1: ");
    Double hw1 = kin.nextDouble();
    System.out.print("HW2: ");
    Double hw2 = kin.nextDouble();
    System.out.print("HW3: ");
    Double hw3 = kin.nextDouble();
    Double hwtotalpercent = ((hw1/100)+(hw2/100)+(hw3/100))/3;
    
    System.out.println("Please Enter Grades for the Quizzes");
    System.out.print("Quiz1: ");
    Double qz1 = kin.nextDouble();
    System.out.print("Quiz2: ");
    Double qz2 = kin.nextDouble();
    Double qztotalpercent = ((qz1/100)+(qz2/100))/2;
    
    System.out.println("Please Enter Grades for the Final Exam");
    System.out.print("Final: ");
    Double fn1 = kin.nextDouble();
    Double fntotalpecent = (fn1/100);
    
    System.out.println("The average of the Homework is:  " + (hwtotalpercent*100) +"%"  );
    System.out.println("The average of the Quizzes is:   " + (qztotalpercent*100) +"%"  );
    System.out.println("The average of the Final Exam is: " + (fntotalpecent*100) +"%"   );
    System.out.println("The Final grade is: " + ( (hwtotalpercent*20) + (qztotalpercent*50) + (fntotalpecent*30)   ) +"%"   );
  }
}