package cohort;

import interfaces.IAttack;
import rooms.ClassRoom;
import rooms.Kitchen;

import java.util.ArrayList;

public abstract class Cohort implements IAttack {

    private String name;
    private double knowledge;
    private double tiredness;
    private double stress;
    private double roomLearningPoints;

    public Cohort(String name) {
        this.name = name;
        this.knowledge = 0;
        this.tiredness = 0;
        this.stress = 0;
        this.roomLearningPoints = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }

    public double getTiredness() {
        return tiredness;
    }

    public void setTiredness(double tiredness) {
        this.tiredness = tiredness;
    }

    public double getStress() {
        return stress;
    }

    public void setStress(double stress) {
        this.stress = stress;
    }

    public double getRoomLearningPoints() {
        return roomLearningPoints;
    }

    public void setRoomLearningPoints(double roomLearningPoints) {
        this.roomLearningPoints = roomLearningPoints;
    }

    public void increaseRoomLearningPoints(double roomLearningPoints) {
        this.roomLearningPoints += roomLearningPoints;
    }

    public void increaseKnowledge(double number){
        this.knowledge += number;
    }

    public void increaseStress(double number){
        this.stress += number;
    }

    public void increaseTiredness(double number){
        this.tiredness += number;
    }

    public void decreaseKnowledge(double number){
        this.knowledge -= number;
    }

    public void decreaseStress(double number){
        this.stress -= number;
    }

    public void decreaseTiredness(double number){
        this.tiredness -= number;
    }

    public void pairProgramming(Cohort student){
        if(this.roomLearningPoints <= 20){
            this.knowledge += 10;
        }
        if(student.roomLearningPoints <= 20) {
            student.knowledge += 10;
        }
    }

    public void groupProject(ClassRoom room){
        ArrayList<Cohort> students = room.getStudents();
        for( Cohort student : students){
            if(student.roomLearningPoints <= 20) {
                student.increaseKnowledge(10);
            }
        }
    }

    public String slackMaria(ClassRoom room){
        ArrayList<Cohort> students = room.getStudents();
        for(Cohort student : students){
            student.setStress(0);
        }
        return "Thanks Maria, I needed that chat.";
    }

    public String getfoodItem(Kitchen room){
        room.eat();
        return "Mmmm tasty!";
    }



}
