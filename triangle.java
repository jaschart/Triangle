import java.util.*;

public class triangle {
    public static void main(String[] args) {
        //get user inputs
        Scanner input = new Scanner(System.in);
        double[] sides = new double[3];
        try {
            System.out.print("Enter the length of side a: ");
            sides[0] = input.nextDouble();
            System.out.print("Enter the length of side b: ");
            sides[1] = input.nextDouble();
            System.out.print("Enter the length of side c: ");
            sides[2] = input.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Sorry, we're only accepting numbers");
            return;
        }
        System.out.println(evaluateSides(sides));
    }

    public static String evaluateSides(double[] side){
        //evaluate sides and print observation
        for(int i = 0; i < side.length; i++) {
            if (side[i] <= 0) {
                return " that's not going to result in a triangle.";
            }
        }
        if (side[0] > side[1] + side[2] || side[1] > side[0] + side[2] || side[2] > side[0] + side[1]) {
            return " this can't possibly be a triangle.";
        }
        if (side[0] == side[1] && side[0] == side[2]) {
            return " the triangle is equilateral.";
        } else if (side[0] == side[1] || side[0] == side[2] || side[1] == side[2]) {
            return " the triangle is isosceles.";
        } else {
            return " the triangle is scalene.";
        }
    }


}