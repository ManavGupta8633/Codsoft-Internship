import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = cal.nextInt();
        int marks[] = new int[numSubjects];
        int totalmarks = 0;
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ":"  );
            marks[i] = cal.nextInt();

            
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                return;
            }

            totalmarks += marks[i];
        }

        
        double average = (double) totalmarks / numSubjects;

        
        String grade;
        String remark;
        if (average >= 90) {
            grade = "A+";
            remark = "Excellent Performance";
        } 
        else if (average >= 80) {
            grade = "A";
            remark = "Very Good Performance";
        } 
        else if (average >= 70) {
            grade = "B";
            remark = "Good Performance";
        }
        else if (average >= 60) {
            grade = "C";
            remark = "Satisfactory";
        } 
        else if (average >= 50) {
            grade = "D";
            remark = "Need of Improvement";
        } 
        else {
            grade = "F (Fail)";
            remark = "failed";
        }

        
        System.out.println("\n=== RESULT SUMMARY ===");
        System.out.println("Total Marks      : " + totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade            : " + grade);
        System.out.println("Remark           : " + remark);

        cal.close();
    }
}
