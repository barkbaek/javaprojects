import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String input, name;
        int korean, english, math, sumKorean=0, sumEnglish=0, sumMath=0;
        double avgKorean=0, avgEnglish=0, avgMath=0;

        boolean isFinished = false;

        while (!isFinished) {
            try {
                System.out.println("Enter name:");
                name = scan.nextLine();

                System.out.println("Enter korean score:");
                korean = Integer.parseInt(scan.nextLine());

                System.out.println("Enter english score:");
                english = Integer.parseInt(scan.nextLine());

                System.out.println("Enter math score:");
                math = Integer.parseInt(scan.nextLine());
            } catch (Exception ex) {
                System.out.println("Wrong value is entered. The program is exited, please try again later.");
                break;
            }

            sumKorean += korean;
            sumEnglish += english;
            sumMath += math;

            studentList.add(new Student(name, korean, english, math));

            while (true) {
                System.out.println("Do you want to keep going? (Y/N)");
                input = scan.nextLine();
                if (input.equals("Y") || input.equals("y")) {
                    break;
                } else if (input.equals("N") || input.equals("n")) {
                    isFinished = true;
                    break;
                }
            }
        }
        if (studentList.size() > 0) {
            avgKorean = (double)sumKorean / studentList.size();
            avgEnglish = (double)sumEnglish / studentList.size();
            avgMath = (double)sumMath / studentList.size();
        }

        System.out.printf("%-12s\t\t\t%s\t\t%s\t\t%s\n", "Name", "Korean", "English", "Math");

        for (Student student: studentList) {
            System.out.printf("%-12s\t\t\t%d\t\t%d\t\t%d\n", student.getName(), student.getKorean(), student.getEnglish(), student.getMath());
        }

        System.out.printf("\n%-12s\t\t\t%d\t\t%d\t\t%d\n", "Total", sumKorean, sumEnglish, sumMath);
        System.out.printf("%-12s\t\t\t%.2f\t\t%.2f\t\t%.2f\n", "Average", avgKorean, avgEnglish, avgMath);
    }
}

