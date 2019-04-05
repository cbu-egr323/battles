
public class Triangle
{
    private double s1;
    private double s2;
    private double s3;

    //******************************************************************
    public Triangle(double sideA, double sideB, double sideC) {
        this.s1 = sideA;
        this.s2 = sideB;
        this.s3 = sideC;
    }
    //******************************************************************

    public boolean isEquilateral() {
        return s1 == s2 && s2 == s3;
    }
    //******************************************************************
    public boolean isScalene() {
        return s1 != s2 && s2 != s3 && s1 != s3;
    }
    //******************************************************************
    public boolean isIsosceles() {
        return !isScalene();        //at LEAST two sides are the same
    }

    public boolean NotATriangle() {
        return ((s1 + s2) < s3) ||
                ((s1 + s3) < s2) ||
                ((s2 + s3) < s1);
    }
}