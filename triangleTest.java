import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Jason on 7/23/2016.
 */
public class triangleTest{
    triangle test = new triangle();

    @Test
    public void jasonIsABoneHeadBecause() throws Exception {
        double[] s = {1, 1, 3};
        assertEquals(test.evaluateSides(s), " this can't possibly be a triangle.");
    }
    @Test
    public void ifAnyLengthIsNotAPositiveIntegerThen() throws Exception {
        double[] s = {0,1,1};
        assertEquals(test.evaluateSides(s)," that's not going to result in a triangle.");
    }
    @Test
    public void ifAllLengthsAreEqual(){
        double[] s = {1,1,1};
        assertEquals(test.evaluateSides(s)," the triangle is equilateral.");
    }
    @Test
    public void ifAnyTwoSidesAreEqual(){
        double[] s = {1,2,2};
        assertEquals(test.evaluateSides(s)," the triangle is isosceles.");
    }
    @Test
    public void ifAllSidesAreDifferent(){
        double[] s = {1,2,3};
        assertEquals(test.evaluateSides(s)," the triangle is scalene.");
    }
}
