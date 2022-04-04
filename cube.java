import java.util.Scanner;

public class Cube {

    public void cubeClass() {

        Scanner input=new Scanner(System.in);
        

        System.out.println("\nYou selected Cube");
            System.out.println("Enter Side of Cube");
            float side = input.nextFloat();
            float Perimeter = 12*side;
            System.out.println("Perimeter of cube : "+ Perimeter);
            float Tsa = 6*side;
            System.out.println("Total surface area of cube is : "+ Tsa);
            float volume = side*side*side;
            System.out.println("volume of cube is : "+ volume);

        
        
    }
    
}
