import java.util.*;
public class Circle
{
   public float radius;
   public Point center;
   
   public Circle(Point center, float radius)
   {
      this.center = center;
      this.radius = radius;
   }
   
   public float getRadius()
   {
      return radius;
   }
   
   public void setRadius(float r)
   {
      radius = r;
   }
   
   public Point getCenter()
   {
      return center;
   }
   
   public void setCenter(Point c)
   {
      center = c;
   }
   
   public String toString()
   {
      return "Center: " + center + " Radius: " + radius;
   }
}