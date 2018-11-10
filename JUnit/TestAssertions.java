import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void testAssertions() {
        //Define test data
        String str1 = new String ("cit360");
        String str2 = new String ("cit360");
        String str3 = null;
        String str4 = "junit";
        String str5 = "junit";

        int val1 = 260;
        int val2 = 360;

        String[] expectedArray = {"weekone", "weektwo", "weekthree"};
        String[] resultArray =  {"weekone", "weektwo", "weekthree"};


        //Is the object NULL?
        assertNull(str3);

        //Do these references point to the same object?
        assertSame(str4,str5);

        //Do these references not point to the same object?
        assertNotSame(str1,str3);

        //Are these two objects equal?
        assertEquals(str1, str2);

        //Does this condition evaluate to true?
        assertTrue (val1 < val2);

        //Does this condition evaluate to false?
        assertFalse(val1 > val2);

        //Is the object not NULL?
        assertNotNull(str1);

        //Are these arrays equal to each other?
        assertArrayEquals(expectedArray, resultArray);
    }
}

