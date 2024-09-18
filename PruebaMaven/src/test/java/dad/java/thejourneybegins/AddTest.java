package dad.java.thejourneybegins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {


    private Add add;

    @Before
    public void setup(){
    add = new Add();
    }

    @Test
    public void test1(){
        assertEquals(3, add.solutions(1,2));
    }

}
