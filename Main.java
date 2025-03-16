import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        ArrayList<Integer> Grades = new ArrayList <>();
        Scanner scanner = new Scanner (System.in);
        Teacher teacher = new Teacher();
        while (true) {
        System.out.println("Hello Mr");
        System.out.println("What Do Want to Do?: ");
        System.out.println("1. Enter Students Grades");
        System.out.println("2. Get The Average Score for the Student");
        System.out.println("3. Get The Highest & Lowest Score");
        System.out.println("4. Exit");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :
            teacher.Enter_Grades(Grades, scanner);
            break;
            case 2:
            teacher.Average(Grades);
            break;
            case 3:
            teacher.highest_Lower_Scores(Grades);
            break;
            case 4:
            System.out.print("Exiting... Goodbye");
            return;
            default:
            System.out.print("Please Enter Valid Choice");
            break;
            }
        }
    }
}


class Teacher {
    int grades;

    public void Enter_Grades (ArrayList<Integer> Grades, Scanner scanner){
        System.out.println("Please Enter Grades of The Students");
        System.out.println("Enter -1 to Exit ");
        while (true) {
            int grades =  scanner.nextInt();
            if (grades == -1){
                break;
            }
            Grades.add(grades);
        }
    }

    public void Average (ArrayList<Integer> Grades){
        int count = 0;
        for (int Score : Grades){
            count += Score;
        }
        int average = count / (Grades.size());
        System.out.println("The Average Grades For This Student is: " + average);
    }

    public void highest_Lower_Scores (ArrayList<Integer> Grades){
        int high_score = Collections.max(Grades);
        int low_score = Collections.min(Grades);
        System.out.println("The Highest Score For This Student is: " + high_score);
        System.out.println("The Lowest Score For This Student is: " + low_score);
    }
}

