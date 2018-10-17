import static org.junit.Assert.*;

public class TriangleTest {

    @org.junit.Test
    public void isTriangleTrue() {
        assertEquals(new Triangle().check(16,8,10), true);
    }
    @org.junit.Test
    public void triangleWithNegativeSides() {
        assertEquals(new Triangle().check(-3,-4,-5), false);
    }
    @org.junit.Test
    public void isTriangleForRightTrue() {
        assertEquals(new Triangle().check(3,4,5), true);
    }
    @org.junit.Test
    public void triangleWithAllZeros() {
        assertEquals(new Triangle().check(0,0,0), false);
    }
    @org.junit.Test
    public void isTriangleForEquilateralTrue() {
        assertEquals(new Triangle().check(6,6,6), true);
    }
    @org.junit.Test
    public void isTriangleForIsoscelesTrue() {
        assertEquals(new Triangle().check(4,4,5), true);
    }
    @org.junit.Test
    public void isTriangleFalse() {
        assertEquals(new Triangle().check(12,1,17), false);
    }
    @org.junit.Test
    public void isTriangleForExactSum() {
        assertEquals(new Triangle().check(3,5,8), false);
    }
    @org.junit.Test
    public void triangleWithOneZeroSide() {
        assertEquals(new Triangle().check(0,5,2), false);
    }
    @org.junit.Test
    public void triangleWithTwoZeroSides() {
        assertEquals(new Triangle().check(15,0,0), false);
    }
}