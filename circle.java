import java.util.Scanner;

public class Circle {

    public void circleClass() {

        Scanner input=new Scanner(System.in);
        Float pie= 22/7f;

        System.out.println("\nYou selected Circle\n");
            System.out.println("Enter Radius of Circle");
            float Radius = input.nextFloat();
            float circumference = 2*pie*Radius;
            System.out.println("\nCircumference of Circle is : "+ circumference);
            float Area = pie*Radius*Radius;
            System.out.println("Area of Circle is : "+ Area);

        
    }
    
}
