import java.util.Scanner;

public class square{

    public void squareclass() {

        Scanner input=new Scanner(System.in);

        System.out.println("\nYou selected Square\n");
            System.out.println("Enter length of Side\n");
            float length = input.nextFloat();
            float Perimeter = 4*length;
            float Area = length*length;
            System.out.println("\nPerimeter of Square : "+ Perimeter);
            System.out.println("Area of Square : "+ Area);

        
    }
}