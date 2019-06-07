package rooms;

import cohort.Cohort;

import java.util.ArrayList;

public abstract class Room {

    private String roomName;
    private ArrayList<Cohort> students;

    public Room(String roomName, ArrayList<Cohort> students) {
        this.roomName = roomName;
        this.students = students;

    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<Cohort> getStudents() {
        return students;
    }
}
