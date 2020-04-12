package codewithme;

public class TestCar {

    public static void main(String[] args) {
        Circle circle1=new Circle(5.0,"red");
        System.out.println(circle1.getColor()+" "+circle1.getRadius());

        Circle circle2=new Circle(3,"blue");
        System.out.println(circle2.getColor()+" "+circle2.getRadius());
    }
}
