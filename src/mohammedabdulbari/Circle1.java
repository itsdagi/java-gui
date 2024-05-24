package mohammedabdulbari;

 class Circle {
    public double r;
    public double area(){
        return Math.PI * r * r;
    }
    public double perimeter(){
        return 2 * Math.PI * r;
    }
    public double circumference(){
        return perimeter();
    }

}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class  Circle1{
     public static void main(String[] args){

         Cylinder cy = new Cylinder();
         cy.r=7;
         cy.height = 10;
         System.out.println("Volume of cylinder "+cy.volume());
         System.out.println("Area of circle "+cy.area());
     }
 }