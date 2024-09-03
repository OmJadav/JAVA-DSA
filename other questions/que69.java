//Write a program that displays the area and perimeter of a circle that has a radius 
// of 5 using the following formula: perimeter = 2 * radius * pi area = radius * 
// radius * pi

public class que69 {
   public static void main(String args[]){
    float pi=3.14f;
    int radius=5;

    double perimeter=2*radius*pi;
    double area=radius*radius*pi;

    System.out.println("Perimeter::"+perimeter);
    System.out.println("Area::"+area);
   }
}
