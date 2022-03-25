import java.util.Scanner;

public class cone {

    public void coneclass() {

        Scanner input=new Scanner(System.in);
        Float pie= 22/7f;

        System.out.println("\nYou selected Cone");
            System.out.println("Enter Radius of Cone");
            float Radius = input.nextFloat();
            System.out.println("Enter slant height of cone");
            float slantheight = input.nextFloat();
            float surfacearea= pie*Radius*slantheight+pie*Radius*Radius;
            System.out.println("Surface area of cone is : "+ surfacearea);
            float volume = pie*Radius*Radius*slantheight/3;
            System.out.println("volume of cone is : "+ volume);
        
    }
    
}
