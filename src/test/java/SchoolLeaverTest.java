import cohort.*;
import org.junit.Before;
import org.junit.Test;
import rooms.ClassRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SchoolLeaverTest {

    private SchoolLeaver schoolLeaver;
    private Graduate graduate;
    private Lecturer lecturer;
    private ClassRoom classroom;
    private ArrayList<Cohort> students;

    @Before
    public void setUp() {
        this.schoolLeaver = new SchoolLeaver("Lindsey");
        this.graduate = new Graduate("Anne");
        this.lecturer =  new Lecturer("Ali");
        this.students = new ArrayList<Cohort>();
        students.add(graduate);
        students.add(schoolLeaver);

    }

    @Test
    public void hasName() {
        assertEquals("Lindsey", schoolLeaver.getName());
    }

    @Test
    public void startsWithTwentyKnowledge() {
        assertEquals(0, schoolLeaver.getKnowledge(), 0.00);
    }

    @Test
    public void startsWithZeroStress() {
        assertEquals(0, schoolLeaver.getStress(), 0.00);
    }

    @Test
    public void startsWithZeroTiredness() {
        assertEquals(0, schoolLeaver.getTiredness(), 0.00);
    }

    @Test
    public void canCallPairProgramming(){
        schoolLeaver.pairProgramming(graduate);
        assertEquals(10, schoolLeaver.getKnowledge(), 0.00);
        assertEquals(30, graduate.getKnowledge(), 0.00);
    }

    @Test
    public void canDoGroupProject(){
        this.classroom = new ClassRoom("G12", lecturer, students);
        schoolLeaver.groupProject(classroom);
        assertEquals(20, schoolLeaver.getKnowledge(), 0.00);
        assertEquals(50, graduate.getKnowledge(), 0.5);
    }

    @Test
    public void canAskQuestions() {
        this.classroom = new ClassRoom("G12", lecturer, students);
        schoolLeaver.attack(classroom);
        assertEquals(15, schoolLeaver.getKnowledge(), 0.00);
        assertEquals(42, graduate.getKnowledge(), 0.5);
    }
}
