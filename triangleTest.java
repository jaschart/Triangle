import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

/**
 * Created by Jason_Hartung on 7/22/2016.
 */

public class triangleTest extends triangle{
    @Test
    public void testInput() throws Exception {
        getSides();
    }
    @Test
    public void testEquilateralTriangle() throws Exception {
        int a = 1;
        int b = 2;
        int c = 3;
        evaluateSides(a,b,c);
        //assertEquals("The triangle is", "expected");
    }

}