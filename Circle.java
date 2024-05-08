
public class Circle {

    float radius;
    final double PI = 3.14;
    
    public Circle(float radius){

        this.radius = radius;
    }

    public double areaOfCircle(){
        return PI * radius * radius;
    }

    public double circumferenceOfCircle(){
        return 2 * PI * radius; 
    }

    public static void main(String[] args) {
        
        Circle c1 = new Circle(5);
        System.out.println("Area of circle : " +c1.areaOfCircle());
        System.out.println("Circumference of circle : "+c1.circumferenceOfCircle());
         
    }
}
