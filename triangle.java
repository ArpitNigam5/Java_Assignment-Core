import java.util.Scanner;

public class triangle {

    public void triangleclass() {

        Scanner input=new Scanner(System.in);

        System.out.println("\nYou selected Triangle\n");
            System.out.println("Enter base of Triangle");
            float base = input.nextFloat();
            System.out.println("Enter height of Triangle");
            float height = input.nextFloat();
            float Area = base*height/2;
            System.out.println("Area of Triangle is : \n"+ Area);
            System.out.println("Enter remaining 2 sides for Perimeter");
            float s1 = input.nextFloat();
            Float s2 = input.nextFloat();
            float Perimeter = s1+base+s2;
            System.out.println("Perimeter of Triangle is : "+ Perimeter);
        
    }
    
}
