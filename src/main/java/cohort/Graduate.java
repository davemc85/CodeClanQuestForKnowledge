package cohort;

import rooms.ClassRoom;

import java.util.ArrayList;

public class Graduate extends Cohort{
    public Graduate(String name) {
        super(name);
        this.setKnowledge(20);
    }

    public String attack(ClassRoom room) {
        ArrayList<Cohort> students = room.getStudents();
        for (Cohort student : students){
            if(student.getRoomLearningPoints() <= 20) {
                student.increaseKnowledge(5);
            }
        }
        return "That was a good chat about that lesson!";
    }

    public void increaseKnowledge(double number){
        super.increaseKnowledge(number * 1.5) ;
    }
}
