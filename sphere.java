import java.util.Scanner;

public class sphere {

    public void sphereclass() {

        Scanner input=new Scanner(System.in);

        Float pie= 22/7f;

        System.out.println("\nYou selected Sphere\n");
            System.out.println("Enter Radius of sphere");
             float Radius = input.nextFloat();
            float csa= 4*pie*Radius*Radius;
            System.out.println("Curved surface Area of sphere is : "+ csa); 
            float volume = 4*pie*Radius*Radius*Radius/3;
            System.out.println("Volume of sphere is : "+ volume);

        
    }
    
}
