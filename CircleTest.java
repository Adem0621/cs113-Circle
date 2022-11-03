import java.util.*;
public class CircleTest
{
   public static void main(String[] args)
   {
      Random random1 = new Random();
      Scanner scan = new Scanner(System.in);
      
      int x = random1.nextInt(10) + 1;
      int y = random1.nextInt(10) + 1;
      
      Point point1 = new Point(x, y);
      Point point2 = new Point(0, 0);
      
      System.out.println("Enter radius: ");
      float r = scan.nextFloat();
      
      Circle circle1 = new Circle(point2, r);
      Circle circle2 = new Circle(point1, 5.5f);
      
      System.out.println("Circle 1 summmary = " + circle1);
      System.out.println("Circle 2 summmary = " + circle2);
      
      System.out.println("Distance between centers of both circles= " + point1.distance(point2));
   }
}