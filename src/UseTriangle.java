import java.text.NumberFormat;
import java.util.Scanner;
public class UseTriangle {
    public static void main(String args[]) {
        while (true) {
            System.out.println("Please enter 3 number lengths for each side of the" +
                    " triangle. Press enter after each number. Type Q to quit.");
            double sideA = getInput("A");
            double sideB = getInput("B");
            double sideC = getInput("C");
            Triangle t = new Triangle(sideA, sideB, sideC);

            if(t.isScalene()){
                System.out.println("Triangle is scalene");
            } else if(t.isIsosceles()){
                System.out.println("Triangle is isoceles");
            } else if(t.isEquilateral()){
                System.out.println("Triangle is scalene");
            }
        }
    }

    private static double getInput(String sideName) {
        System.out.println("Side " + sideName + ":");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().strip();
        if (input == "Q")
            System.exit(0);
        try {
            double side = Double.valueOf(input);
            if (!Double.isFinite(side)) {
                System.out.println("This is not a number.  Please type a number.");
            } else if (side < 0) {
                System.out.println("The lengths of the sides of the triangle must be positive");
            } else {
                return side;    //only if number is valid
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR! A non-numerical value has been entered");
        }
        return getInput(sideName);
    }
}
