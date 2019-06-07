package cohort;

import rooms.ClassRoom;

import java.util.ArrayList;

public class SchoolLeaver extends Cohort{
    public SchoolLeaver(String name) {
        super(name);
    }

    public String attack(ClassRoom room) {
        ArrayList<Cohort> students = room.getStudents();
        for (Cohort student : students){
            if(student.getRoomLearningPoints() <= 20) {
                student.increaseKnowledge(5);
            }
        }
        return "What an interesting question!";
    }
}
