
class Circle
{
     private double radius;
     public void setradius(double r)
     {
            radius = r;
     }
     public double getarea()
     {
           return 3.14*radius*radius;
     }
}
class Area
{
     public static void          main(String[]args)
     {
         Circle circle = new Circle();
         circle.setradius(6);
         System.out.println("Area of circle is: " + circle.getarea());
     }
}
  