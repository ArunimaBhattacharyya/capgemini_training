package polymorphism.compileTime;
import java.util.*;

public class MyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter side:");
                double side = sc.nextDouble();
                System.out.println(Area_calculator.calculateArea(side));
                break;

            case 2:
                System.out.println("Enter length:");
                double length = sc.nextDouble();
                System.out.println("Enter breadth:");
                double breadth = sc.nextDouble();
                System.out.println(Area_calculator.calculateArea(length, breadth));
                break;

            case 3:
                System.out.println("Enter radius:");
                float radius = sc.nextFloat();
                System.out.println(Area_calculator.calculateArea(radius));
                break;

            default:
                System.out.println("Not applicable");
        }
    }
}
