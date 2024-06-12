public class Circle extends Shape{
    //define veriables
    private double radius;

    //Create a circle object 
    public Circle(){
        super();
        this.radius = 1;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    //get the radius
    public double getRadius() {
        return radius;
    }

    //set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //calculate the area 
    public double getArea(){
        return (3.14*(radius*radius));
    }

    //calculate the perimeter
    public double getPerimeter(){
        return(3.14*(radius *2));
    }

    //convert the object to a string
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Circle[" + super.toString() + ", radius = " + radius + "]");
    }
}