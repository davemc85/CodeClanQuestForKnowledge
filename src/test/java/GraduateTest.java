import cohort.Cohort;
import cohort.Graduate;
import cohort.Lecturer;
import org.junit.Before;
import org.junit.Test;
import rooms.ClassRoom;
import rooms.Kitchen;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GraduateTest {

    private Graduate graduate;
    private Lecturer lecturer;
    private ArrayList<Cohort> students;
    private ClassRoom room;
    private Kitchen kitchen;

    @Before
    public void setUp(){
        this.graduate = new Graduate("Anne");
        this.lecturer = new Lecturer("Colin");
        this.students = new ArrayList<Cohort>();
        this.students.add(graduate);
        this.kitchen = new Kitchen(this.students);
    }

    @Test
    public void hasName() {
        assertEquals("Anne", graduate.getName());
    }

    @Test
    public void startsWithTwentyKnowledge() {
        assertEquals(20, graduate.getKnowledge(), 0.00);
    }

    @Test
    public void startsWithZeroStress() {
        assertEquals(0, graduate.getStress(), 0.00);
    }

    @Test
    public void startsWithZeroTiredness() {
        assertEquals(0, graduate.getTiredness(), 0.00);
    }

    @Test
    public void canShareKnowledge() {
        this.room = new ClassRoom("G12", lecturer, students);
        graduate.attack(room);
        assertEquals(42, graduate.getKnowledge(), 0.5);
    }

    @Test
    public void canSlackMaria(){
        this.room = new ClassRoom("G12", lecturer, students);
        assertEquals("Thanks Maria, I needed that chat.", graduate.slackMaria(room));
        assertEquals(0, graduate.getStress(), 0.00);
    }

    @Test
    public void canEat(){
        graduate.setTiredness(1);
        assertEquals("Mmmm tasty!", graduate.getfoodItem(kitchen));
        assertNotEquals(1, graduate.getTiredness());
    }
}
