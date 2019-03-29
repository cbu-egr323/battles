import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void equilateralTest(){
        Assert.assertTrue(new Triangle(1, 1, 1).isEquilateral());
        Assert.assertTrue(new Triangle(4, 4, 4).isEquilateral());
        Assert.assertFalse(new Triangle(1, 1, 4).isEquilateral());
        Assert.assertFalse(new Triangle(4, 1, 4).isEquilateral());
        Assert.assertFalse(new Triangle(1, 4, 4).isEquilateral());
        Assert.assertFalse(new Triangle(1, 4, 5).isEquilateral());
    }

    @Test
    public void isocelesTest(){
        Assert.assertFalse(new Triangle(1, 1, 1).isIsosceles());
        Assert.assertFalse(new Triangle(4, 4, 4).isIsosceles());
        Assert.assertTrue(new Triangle(1, 1, 4).isIsosceles());
        Assert.assertTrue(new Triangle(4, 1, 4).isIsosceles());
        Assert.assertTrue(new Triangle(1, 4, 4).isIsosceles());
        Assert.assertFalse(new Triangle(1, 4, 5).isIsosceles());
    }

    @Test
    public void scaleneTest(){
        Assert.assertFalse(new Triangle(1, 1, 1).isScalene());
        Assert.assertFalse(new Triangle(4, 4, 4).isScalene());
        Assert.assertFalse(new Triangle(1, 1, 4).isScalene());
        Assert.assertFalse(new Triangle(4, 1, 4).isScalene());
        Assert.assertFalse(new Triangle(1, 4, 4).isScalene());
        Assert.assertTrue(new Triangle(1, 4, 5).isScalene());
    }
}
