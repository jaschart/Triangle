import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        getSides();
    }
    public static void getSides() {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        //get lengths of sides from user
        try {
            System.out.print("Enter side A of the triangle: ");
            a = input.nextInt();
            System.out.print("Enter side B of the triangle: ");
            b = input.nextInt();
            System.out.print("Enter side C of the triangle: ");
            c = input.nextInt();

            evaluateSides(a, b, c);

            input.close();
        }catch(InputMismatchException ime){
            System.out.print(ime);
        }
    }

    public static void evaluateSides(double a, double b, double c) {
        //evaluate sides and print observation
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("This is not a triangle.");
        } else {
            if (a == b && a == c) {
                System.out.print("The triangle is equilateral.");
            } else if (a == b || a == c || b == c) {
                System.out.print("The triangle is isosceles.");
            } else {
                System.out.print("The triangle is scalene.");
            }
        }
    }
}
