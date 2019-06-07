import cohort.Graduate;
import cohort.Lecturer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LecturerTest {

    private Lecturer lecturer;
    private Graduate graduate;

    @Before
    public void setUp(){
        this.lecturer = new Lecturer("Alistair");
        this.graduate = new Graduate("Anne");
    }

    @Test
    public void canGetName() {
        assertEquals("Alistair", lecturer.getName());
    }

    @Test
    public void canGetKnowledge() {
        assertEquals(20, lecturer.getKnowledge(), 0.00);
    }

    @Test
    public void canTeach(){
        lecturer.teach(graduate);
        assertEquals(35, graduate.getKnowledge(), 0.5);
        assertEquals(1, graduate.getStress(), 0.00);
        assertEquals(10, graduate.getTiredness(), 0.00);
    }
}
