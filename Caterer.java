import java.util.ArrayList;

public class Caterer {
    static void sendReminder(ArrayList<Student> list) {
        if(!list.isEmpty()) {
            for (Student student : list) {
                System.out.println(student.getContact() + " : " + student.getName());
                Lunch.getTime(student);
            }
        }
        else
            System.out.println("No student in the list");
    }

    static int remainderLunch(ArrayList<Student> list) {
        int count = 0;
        for(Student student: list) {
            if(student.getLunchStatus() == 0)
                count++;
        }
        return count;
    }
}