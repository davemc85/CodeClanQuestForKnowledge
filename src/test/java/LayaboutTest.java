import cohort.Cohort;
import cohort.Layabout;
import cohort.Lecturer;
import org.junit.Before;
import org.junit.Test;
import rooms.ClassRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LayaboutTest {

    private Layabout layabout;
    private Lecturer lecturer;
    private ArrayList<Cohort> students;
    private ClassRoom room;

    @Before
    public void setUp() {
        this.layabout = new Layabout("David");
        this.lecturer = new Lecturer("Colin");
        this.students = new ArrayList<Cohort>();
        this.students.add(layabout);
    }

    @Test
    public void hasName() {
        assertEquals("David", layabout.getName());
    }

    @Test
    public void startsWithTwentyKnowledge() {
        assertEquals(0, layabout.getKnowledge(), 0.00);
    }

    @Test
    public void startsWithZeroStress() {
        assertEquals(0, layabout.getStress(), 0.00);
    }

    @Test
    public void startsWithZeroTiredness() {
        assertEquals(20, layabout.getTiredness(), 0.00);
    }

    @Test
    public void canGoOnNightOut() {
        this.room = new ClassRoom("G12", lecturer, students);
        layabout.setStress(3);
        layabout.attack(room);
        assertEquals(2, layabout.getStress(), 0.00);
        assertEquals(50, layabout.getTiredness(), 0.00);
    }
}
