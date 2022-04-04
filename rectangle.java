import java.util.Scanner;

public class Rectangle {

    public void rectangleClass() {

        Scanner input= new Scanner(System.in);

        System.out.println("\nYou selected Rectangle\n");
            System.out.println("Enter Length");
            float Length = input.nextFloat();
            System.out.println("Enter width");
            float width = input.nextFloat();
            float Perimeter = 2*(Length+width);
            System.out.println("\nPerimeter of Rectangle is "+ Perimeter);
            float Area = Length*width;
            System.out.println("Area of Rectangle is "+ Area);
        
    }
    
}
