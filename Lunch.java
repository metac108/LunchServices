import java.util.InputMismatchException;
import java.util.Scanner;

public class Lunch {
    static Student bookLunch() {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Your Name: ");
        student.setName(scan.nextLine());
        System.out.println("Enter Enrollment number: ");
        student.setErollNo(scan.nextLine());
        System.out.println("Enter Contact number: ");
        int flag = 0;
        while (flag == 0) {
            try {
                student.setContact(scan.nextLong());
                flag = 1;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid phone no. (digits only)");
                scan.next();
            }
        }
        System.out.println("Enter Your Year (1, 2, 3 or 4): ");
        flag = 0;
        while (flag == 0) {
            try {
                student.setYear(scan.nextInt());
                flag = 1;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid year");
                scan.next();
            }
        }
        System.out.println("\n\nYou have been Added!");
        return student;
    }

    static void getTime(Student student) {
        int year = student.getYear();
        if(year == 1 || year == 2)
            System.out.println("You are on the list and your timings are 1:00 pm to 2:00 pm");
        else
            System.out.println("You are on the list and your timings are 2:00 pm to 3:00 pm");
    }
}
