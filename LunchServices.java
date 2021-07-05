import java.util.ArrayList;
import java.util.Scanner;

public class LunchServices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        String flag = null;
        do {
            System.out.println("\t\tWELCOME TO SGSITS LUNCH SERVICES");
            System.out.println("\n1. Student Services\n2. Caterer Services\n\nEnter choice here ----> ");
            int choice = scan.nextInt();
            System.out.flush();
            if(choice == 1) {
                System.out.println("\t\tWELCOME TO STUDENT SERVICES");
                System.out.println("\n1. Book Lunch\n2. Gift your Lunch\n3. Get Status/Time of Lunch\n4. Check-in\n\nEnter choice here ---->");
                choice = scan.nextInt();
                String erollNo;
                System.out.flush();
                switch (choice) {
                    case 1:
                        studentList.add(Lunch.bookLunch());
                        break;
                    case 2:
                        if(!studentList.isEmpty()) {
                            scan.nextLine();
                            System.out.println("Enter your Enrollment number: ");
                            erollNo = scan.nextLine();
                            choice = 0;
                            for (int i = 0; i < studentList.size(); i++) {
                                if (studentList.get(i).getErollNo().equals(erollNo.toUpperCase())) {
                                    studentList.set(i, Lunch.bookLunch());
                                    choice = 1;
                                    break;
                                }
                            }
                            if (choice == 0)
                                System.out.println("Student not found");
                        }
                        else
                            System.out.println("No student in the list");
                        break;
                    case 3:
                        if(!studentList.isEmpty()) {
                            scan.nextLine();
                            System.out.println("Enter your Enrollment number: ");
                            erollNo = scan.nextLine();
                            choice = 0;
                            for (Student student : studentList) {
                                if (student.getErollNo().equals(erollNo.toUpperCase())) {
                                    Lunch.getTime(student);
                                    choice = 1;
                                    break;
                                }
                            }
                            if (choice == 0)
                                System.out.println("Student not found");
                        }
                        else
                            System.out.println("No student in the list");
                        break;
                    case 4:
                        if(!studentList.isEmpty()) {
                            scan.nextLine();
                            System.out.println("Enter your Enrollment number: ");
                            erollNo = scan.nextLine();
                            choice = 0;
                            for (Student student : studentList) {
                                if (student.getErollNo().equals(erollNo.toUpperCase())) {
                                    student.setLunchStatus(1);
                                    choice = 1;
                                    break;
                                }
                            }
                            if (choice == 0)
                                System.out.println("Student not found");
                        }
                        else
                            System.out.println("No student in the list");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
            else if(choice == 2) {
                System.out.println("\t\tWELCOME TO CATERER SERVICES");
                System.out.println("\n1. Get Lunch Count\n2. Send Lunch Reminder\n3. Get Remaining Lunch\n\nEnter choice here ---->");
                choice = scan.nextInt();
                System.out.flush();
                switch (choice) {
                    case 1:
                        System.out.println("The number of Lunch required is " + studentList.size());
                        break;
                    case 2:
                        Caterer.sendReminder(studentList);
                        break;
                    case 3:
                        if(!studentList.isEmpty())
                            System.out.println(Caterer.remainderLunch(studentList));
                        else
                            System.out.println("No student in the list");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            System.out.println("Do you want to use the services again ?(Y/N)");
            flag = scan.next();
        } while(flag.equals("y") || flag.equals("Y") || flag.equals("Yes") || flag.equals("yes") || flag.equals("YES"));
    }
}