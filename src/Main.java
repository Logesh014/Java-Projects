import java.util.Scanner;
class StudentGradeCalculator {

    String stdname;
    int marks;
    int rollno;

    StudentGradeCalculator(String stdname, int marks, int rollno) {
        this.stdname = stdname;
        this.marks = marks;
        this.rollno = rollno;
    }

    void displayDetails(double total, double avg, char grade) {
        System.out.println("\n********* Student Report *********");
        System.out.println("Name: " + stdname);
        System.out.println("Roll No: " + rollno);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("**********************************");
    }
}

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int subject1;
            int subject2;
            int subject3;
            int subject4;
            int subject5;


            System.out.println("Enter your Name:");
            String stdname = input.nextLine();
            System.out.println("Enter your Rollno:");
            int rollno = input.nextInt();


            StudentGradeCalculator sgc = new StudentGradeCalculator(stdname, 0, rollno);


            System.out.println("****************Student_Grade_Calculator****************");

            System.out.println("Enter the obtained Mark of the Subject 1:");
            subject1 = input.nextInt();
            System.out.println("Enter the obtained Mark of the Subject 2:");
            subject2 = input.nextInt();
            System.out.println("Enter the obtained Mark of the Subject 3:");
            subject3 = input.nextInt();
            System.out.println("Enter the obtained Mark of the Subject 4:");
            subject4 = input.nextInt();
            System.out.println("Enter the obtained Mark of the Subject 5:");
            subject5 = input.nextInt();


            double total = (subject1 + subject2 + subject3 + subject4 + subject5);
            double avg = total / 5.0;
            System.out.println("Average Mark is :" + avg);

            char Grade='F';
            if (avg >= 90) {
                Grade = 'A';
                System.out.println("Your Grade is:" + Grade);
            } else if (avg >= 80) {
                Grade = 'B';
                System.out.println("Your Grade is:" + Grade);
            } else if (avg >= 70) {
                Grade = 'C';
                System.out.println("Your Grade is:" + Grade);
            } else if (avg >= 60) {
                Grade = 'D';
                System.out.println("Your Grade is:" + Grade);
            } else {
                System.out.println("Try to get more marks");
            }
            sgc.displayDetails(total, avg, Grade);
            input.close();
        }
    }