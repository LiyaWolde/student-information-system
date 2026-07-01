import java.util.Scanner;

public class StudentInformationSystem {

    // Displays the program title
    public static void welcome() {
        System.out.println("===========================================");
        System.out.println("        STUDENT INFORMATION SYSTEM");
        System.out.println("===========================================");
    }


    // Determines the student's performance
    public static String getPerformance(double cgpa) {
        if (cgpa >= 3.5) {
            return "Excellent Student";
        } else if (cgpa >= 2.5) {
            return "Good Student";
        } else {
            return "Needs Improvement";
        }
    }

    // Determines the semester load
    public static String getSemesterLoad(int courses) {
        if (courses > 6) {
            return "Heavy Semester";
        } else {
            return "Normal Semester";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        welcome();

        // User Input
        System.out.print("\nEnter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Clear buffer

        System.out.print("Enter your gender (Male/Female): ");
        String gender = input.nextLine();

        System.out.print("Enter your Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter your department: ");
        String department = input.nextLine();

        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.print("Enter number of courses: ");
        int courses = input.nextInt();

        System.out.print("Enter expected graduation year: ");
        int graduationYear = input.nextInt();

        // Display Student Summary
        System.out.println("\n===========================================");
        System.out.println("            STUDENT SUMMARY");
        System.out.println("===========================================");

        System.out.println("Name                : " + name);
        System.out.println("Age                 : " + age);
        System.out.println("Gender              : " + gender);
        System.out.println("Student ID          : " + studentID);
        System.out.println("Department          : " + department);
        System.out.println("CGPA                : " + cgpa);
        System.out.println("Courses Registered  : " + courses);
        System.out.println("Expected Graduation : " + graduationYear);

        System.out.println("-------------------------------------------");

        System.out.println("Performance         : " + getPerformance(cgpa));
        System.out.println("Semester Load       : " + getSemesterLoad(courses));

        System.out.println("===========================================");
        System.out.println("Thank you for using the Student Information System!");
        System.out.println("===========================================");

        input.close();
    }
}