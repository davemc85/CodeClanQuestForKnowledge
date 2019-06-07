package rooms;

import cohort.Cohort;
import cohort.Lecturer;

import java.util.ArrayList;

public class ClassRoom extends Room {


    private Lecturer lecturer;


    public ClassRoom(String roomName, Lecturer lecturer, ArrayList<Cohort> students) {
        super(roomName, students);
        this.lecturer = lecturer;
        this.teachCohort();
    }

    public void teachCohort(){
        for(Cohort student : this.getStudents()){
            lecturer.teach(student);
            student.setRoomLearningPoints(10);
        }
    }

    public Lecturer getLecturer() {
        return this.lecturer;
    }

    public String checkLectureFinished(){
        double total = 0;
        for (Cohort student : this.getStudents()){
            total += student.getRoomLearningPoints();
        }
        if ((total/this.getStudents().size()) >= 20){
            return "That's us done for this lesson";
        }
        return "Let's go over that one more time.";
    }
}
