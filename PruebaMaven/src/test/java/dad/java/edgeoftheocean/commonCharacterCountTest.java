package dad.java.edgeoftheocean;

import junit.framework.TestCase;
import org.junit.Test;

public class commonCharacterCountTest extends TestCase {

    @Test
    public void test() {
        assertEquals(3,commonCharacterCount.solution("aabcc","adcaa"));
    }

    @Test
    public void test2() {
        assertEquals(0,commonCharacterCount.solution("aabcc","adcaa"));
    }

    @Test
    public void test3() {
        assertEquals(0, commonCharacterCount.solution("", "abcd"));
        assertEquals(0, commonCharacterCount.solution("abcd", ""));
        assertEquals(0, commonCharacterCount.solution("", ""));
    }

}
