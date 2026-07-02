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

        // Display the welcome banner
        welcome();

        // --- NAME INPUT LOOP ---
        String name;
        while (true) {
            System.out.print("\nEnter your full name: ");
            name = input.nextLine();

            // Validates that it's not empty AND contains only letters and spaces
            if (!name.trim().isEmpty() && name.matches("[a-zA-Z\\s]+")) {
                break; // Escape the loop if the name is perfectly valid!
            } else {
                System.out.println("-> Invalid name! Name cannot be empty and must contain only letters/spaces.");
            }
        }

        // --- AGE INPUT LOOP ---
        int age;
        while (true) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            input.nextLine(); // Clear buffer

            if (age >= 16 && age <= 100) {
                break; // Kick out of the loop because the age is valid!
            } else {
                System.out.println("-> Invalid age! Age must be between 16 and 100. Try again.");
            }
        }

        System.out.print("Enter your gender (Male/Female): ");
        String gender = input.nextLine();

        System.out.print("Enter your Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter your department: ");
        String department = input.nextLine();

        // --- CGPA INPUT LOOP ---
        double cgpa;
        while (true) {
            System.out.print("Enter your CGPA: ");
            cgpa = input.nextDouble();

            if (cgpa >= 0.0 && cgpa <= 4.0) {
                break; // Kick out of the loop because the CGPA is valid!
            } else {
                System.out.println("-> Invalid CGPA! Must be between 0.0 and 4.0. Try again.");
            }
        }

        System.out.print("Enter number of courses: ");
        int courses = input.nextInt();

        System.out.print("Enter expected graduation year: ");
        int graduationYear = input.nextInt();

        // 2. Display Student Summary
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