import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {

        while (true) {
            
        System.out.println("\nSelect the shape to calculate area and perimeters for :\n");
        System.out.println("1.Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        System.out.println("5.Sphere");
        System.out.println("6.Cylinder");
        System.out.println("7.Cone");
        System.out.println("8.Cube");
        System.out.println("9.Cuboid");
        System.out.println("10.exit\n");

        System.out.println("SELECT ANY SHAPE : "); 
        Scanner input = new Scanner(System.in);
         
           
            int shapes = input.nextInt();
                       
             
        
        switch (shapes) {
            case 1:
            square squareobject = new square();
            squareobject.squareclass();
            break;

            case 2:
            rectangle rectangleobject = new rectangle();
            rectangleobject.rectangleclass();
            break;

            case 3:
            circle circleobject = new circle();
            circleobject.circleclass();
            break;

            case 4:
            triangle triangleobject = new triangle();
            triangleobject.triangleclass();
            break;

            case 5:
            sphere sphereobject = new sphere();
            sphereobject.sphereclass();
            break;

            case 6:
            cylinder cylinderobject = new cylinder();
            cylinderobject.cylinderclass();
            break;

            case 7:
            cone coneobject = new cone();
            coneobject.coneclass();
            break;

            case 8:
            cube cubeobject = new cube();
            cubeobject.cubeclass();
            break;

            case 9:
            cuboid cuboidobject = new cuboid();
            cuboidobject.cuboidclass();
            break;

            case 10:
            System.out.println("THANKS !!");
            System.exit(0);
            break;

            default :
              System.out.println("Incorrect input");
              break;
             
        }

        }
}
}
