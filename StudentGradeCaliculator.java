import java.util.Scanner;
public class StudentGradeCaliculator {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int subjectCount;
    int totalMarks = 0;
    double totalAvg = 0;
    System.out.println("Enter Number Of Subjects: ");
    subjectCount = scanner.nextInt();

    int[] subjectmarks = new int[subjectCount];
    System.out.println("Enter the score of each subject: ");

    for(int i = 0; i < subjectCount; i ++){
      subjectmarks[i] = scanner.nextInt();
      totalMarks += subjectmarks[i];
    }
    totalAvg = (double)(totalMarks / subjectCount);

    char grade;
        if (totalAvg >= 90) {
            grade = 'A';
        } else if (totalAvg >= 80) {
            grade = 'B';
        } else if (totalAvg >= 70) {
            grade = 'C';
        } else if (totalAvg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + totalAvg + "%");
    System.out.println("Grade: " + grade);
    scanner.close();
  }
}
