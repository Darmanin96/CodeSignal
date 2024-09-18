package dad.java.exploringthewaters;

import junit.framework.TestCase;
import org.junit.Test;

public class AreSimilarTest extends TestCase {

    @Test
    public void areSimilar() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        assertTrue(AreSimilar.solution(a,b));
    }




}
