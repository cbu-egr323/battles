
public class Triangle
{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isScalene() {
        return sideA != sideB && sideA != sideC && sideB != sideC;
    }

    public boolean isIsosceles() {
        return !(isEquilateral() || isScalene());
    }

    public boolean NotATriangle() {
        return ((sideA + sideB) < sideC) || ((sideA + sideC) < sideB) || ((sideB + sideC) < sideA);
    }
}