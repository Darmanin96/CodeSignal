package dad.java.thejourneybegins;

import junit.framework.TestCase;
import org.junit.Test;

public class CheckPalindromeTest extends TestCase {
    @Test
    public void testCheckPalindrome() {
        assertTrue(checkPalindrome.solution("abccba"));
    }

    @Test
    public void testCheckPalindrome2() {
        assertFalse(checkPalindrome.solution("hello"));
    }
}
