import cohort.Cohort;
import cohort.Layabout;
import cohort.Lecturer;
import org.junit.Before;
import org.junit.Test;
import rooms.ClassRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClassRoomTest {

    private ClassRoom classroom;
    private Lecturer lecturer;
    private Layabout layabout;

    @Before
    public void setUp() {
        this.lecturer =  new Lecturer("Ali");
        this.layabout = new Layabout("David");
        ArrayList<Cohort> students = new ArrayList<Cohort>();
        students.add(layabout);
        this.classroom = new ClassRoom("G12", lecturer, students);
    }

    @Test
    public void hasName() {
        assertEquals("G12", classroom.getRoomName());
    }

    @Test
    public void studentsTaughtOnArrival() {
        assertEquals(10, layabout.getKnowledge(), 0.00);
    }

    @Test
    public void hasALecturer() {
        assertEquals(lecturer, classroom.getLecturer());
    }

    @Test
    public void hasStudents() {
        assertEquals(1, classroom.getStudents().size());
    }

    @Test
    public void canFinishLesson(){
        assertEquals("Let's go over that one more time.", classroom.checkLectureFinished());
        assertEquals(10, layabout.getRoomLearningPoints(), 0.00);
        layabout.setRoomLearningPoints(20);
        assertEquals("That's us done for this lesson", classroom.checkLectureFinished());
    }
}
