import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Jason on 7/23/2016.
 */
public class triangleTest extends triangle{
    @Test
    public void jasonIsABoneHead() throws Exception {
        double[] s = {1, 1, 3};
        assertEquals(evaluateSides(s), " because he didn't test for Triangle Inequality");
    }
    @Test
    public void ifAnyLengthIsNotAPositiveInteger() throws Exception {
        double[] s = {0,1,1};
        assertEquals(evaluateSides(s)," then it's not a triangle.");
    }
    @Test
    public void ifAllLengthsAreEqual(){
        double[] s = {1,1,1};
        assertEquals(evaluateSides(s)," the triangle is equilateral.");
    }
    @Test
    public void ifAnyTwoSidesAreEqual(){
        double[] s = {1,2,2};
        assertEquals(evaluateSides(s)," the triangle is isosceles.");
    }
    @Test
    public void ifAllSidesAreDifferent(){
        double[] s = {1,2,3};
        assertEquals(evaluateSides(s)," the triangle is scalene.");
    }
}
