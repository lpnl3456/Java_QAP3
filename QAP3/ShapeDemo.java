public class ShapeDemo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);

Circle C = new Circle(5.0);

Circle C1 = new Circle(5.0,"blue",true);

Rectangle R = new Rectangle(2.0,3.0);

Rectangle R1 = new Rectangle(2.0,3.0,"green",false);

Square Sq = new Square(4.0);

Square Sq1 = new Square(4.0,"yellow",true);

System.out.println("S :" + S.toString());

System.out.println("C :" + C.toString());


//Print here(C1.getArea() and C1.getPerimeter())
System.out.println("C1 :" + C1.toString());
System.out.println("C1 area: " + C1.getArea());
System.out.println("C1 perimeter: " + C1.getPerimeter());

//Print(R.getArea() and R.getPerimeter())
System.out.println("R :" + R.toString());
System.out.println("R area:" + R.getArea());
System.out.println("R perimeter: " + R.getPerimeter());



//Print(R1.getArea() and R1.getPerimeter())
System.out.println("R1 :" + R1.toString());
System.out.println("R1 area: " + R1.getArea());
System.out.println("R1 perimeter: " + R1.getPerimeter());

//Print(sq.getArea() and sq.getPerimeter())
System.out.println("Sq :" + Sq.toString());
System.out.println("Sq :" + Sq.getArea());
System.out.println("Sq perimeter: " + Sq.getPerimeter());

//Print(sq1.getArea() and sq1.getPerimeter())
System.out.println("Sq1 :" + Sq1.toString());
System.out.println("Sq1 :" + Sq1.getArea());
System.out.println("Sq1 perimeter: " + Sq1.getPerimeter());
    }
}
