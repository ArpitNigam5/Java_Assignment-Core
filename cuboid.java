import java.util.Scanner;

public class Cuboid {

    public void cuboidClass() {

        Scanner input=new Scanner(System.in);
        System.out.println("\nYou selected Cuboid");
        System.out.println("Enter length,Breadth & Height of Cuboid");
        float length = input.nextFloat();
        Float Breadth = input.nextFloat();
        float height = input.nextFloat();
        float Perimeter = 4*length+4*Breadth+4*height;
        System.out.println("Perimeter of cuboid : "+ Perimeter);
         float Tsa = 2*length*Breadth+2*Breadth*height+2*length*height;
        System.out.println("Total surface area of cuboid is : "+ Tsa);
        float volume = length*Breadth*height;
        System.out.println("volume of cuboid is : "+ volume);

        
    }
    
}
