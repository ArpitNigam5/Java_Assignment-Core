import java.util.Scanner;

public class Cylinder {

    public void cylinderClass() {

        Scanner input=new Scanner(System.in);
        Float pie= 22/7f;

        System.out.println("\nYou selected Cylinder");
            System.out.println("Enter Radius of Cylinder");
             float Radius = input.nextFloat();
            System.out.println("Enter Height of Cylinder");
            float height = input.nextFloat();
            float csa = 2*pie*Radius*height;
            System.out.println("Curved surface area of Cylinder is : "+ csa);
            float volume = pie*Radius*Radius*height;
            System.out.println("volume of cylinder is : "+ volume);

        
    }
    
}
