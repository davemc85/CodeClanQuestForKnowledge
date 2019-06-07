package cohort;

public class Lecturer {

    private String name;
    private double knowledge;

    public Lecturer(String name) {
       this.name = name;
       this.knowledge = 20;
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

    public void teach(Cohort cohort){
        cohort.increaseKnowledge(10);
        cohort.increaseStress(1);
        cohort.increaseTiredness(10);
    }

}
