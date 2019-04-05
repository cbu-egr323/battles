import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private Triangle scalene = new Triangle(1, 2, 3);
    private Triangle isoceles1 = new Triangle(4, 4, 5);
    private Triangle isoceles2 = new Triangle(2, 3, 2);
    private Triangle isoceles3 = new Triangle(5, 3, 3);
    private Triangle equilateral = new Triangle(3,3, 3);
    private Triangle notATriangle1 = new Triangle(1, 2, 8);
    private Triangle notATriangle2 = new Triangle(999999, 40, 40);

    @Test
    public void notATriangleTest() {
        Assert.assertTrue(notATriangle1.NotATriangle());
        Assert.assertTrue(notATriangle2.NotATriangle());
        Assert.assertFalse(scalene.NotATriangle());
        Assert.assertFalse(isoceles1.NotATriangle());
        Assert.assertFalse(isoceles2.NotATriangle());
        Assert.assertFalse(isoceles3.NotATriangle());
        Assert.assertFalse(equilateral.NotATriangle());
    }

    @Test
    public void scaleneTest() {
        Assert.assertTrue(scalene.isScalene());
        Assert.assertFalse(isoceles1.isScalene());
        Assert.assertFalse(isoceles2.isScalene());
        Assert.assertFalse(isoceles3.isScalene());
        Assert.assertFalse(equilateral.isScalene());
    }

    @Test
    public void isocelesTest() {
        Assert.assertFalse(scalene.isIsosceles());
        Assert.assertTrue(isoceles1.isIsosceles());
        Assert.assertTrue(isoceles2.isIsosceles());
        Assert.assertTrue(isoceles3.isIsosceles());
        Assert.assertTrue(equilateral.isIsosceles());
    }

    @Test
    public void equilateralTest() {
        Assert.assertFalse(scalene.isEquilateral());
        Assert.assertFalse(isoceles1.isEquilateral());
        Assert.assertFalse(isoceles2.isEquilateral());
        Assert.assertFalse(isoceles3.isEquilateral());
        Assert.assertTrue(equilateral.isEquilateral());
    }
}
