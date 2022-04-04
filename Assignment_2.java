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
            Square squareobject = new Square();
            squareobject.squareClass();
            break;

            case 2:
            Rectangle rectangleobject = new Rectangle();
            rectangleobject.rectangleClass();
            break;

            case 3:
            Circle circleobject = new Circle();
            circleobject.circleClass();
            break;

            case 4:
            Triangle triangleobject = new Triangle();
            triangleobject.triangleClass();
            break;

            case 5:
            Sphere sphereobject = new Sphere();
            sphereobject.sphereClass();
            break;

            case 6:
            Cylinder cylinderobject = new Cylinder();
            cylinderobject.cylinderClass();
            break;

            case 7:
            Cone coneobject = new Cone();
            coneobject.coneClass();
            break;

            case 8:
            Cube cubeobject = new Cube();
            cubeobject.cubeClass();
            break;

            case 9:
            Cuboid cuboidobject = new Cuboid();
            cuboidobject.cuboidClass();
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
