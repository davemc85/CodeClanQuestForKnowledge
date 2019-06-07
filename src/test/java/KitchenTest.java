import cohort.Cohort;
import cohort.Graduate;
import org.junit.Before;
import org.junit.Test;
import rooms.Kitchen;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KitchenTest {

    private Kitchen kitchen;
    private ArrayList<Cohort> students;
    private Graduate graduate;


    @Before
    public void setUp(){
        this.graduate = new Graduate("Anne");
        this.students = new ArrayList<Cohort>();
        this.students.add(graduate);
        this.kitchen = new Kitchen(students);
    }

    @Test
    public void hasFood(){
        assertEquals(1, kitchen.getFood().size());
    }
}
