package cohort;

import rooms.ClassRoom;

import java.util.ArrayList;

public class Layabout extends Cohort{
    public Layabout(String name) {
        super(name);
        this.setTiredness(20);
    }


    public String attack(ClassRoom room) {
        ArrayList<Cohort> students = room.getStudents();
        for (Cohort student : students){
            student.decreaseStress(1);
            student.increaseTiredness(20);
        }
        return "That was a great night out!";
    }
}
