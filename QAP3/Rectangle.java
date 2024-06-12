public class Rectangle extends Shape{

    //Define the Veriables
    private double width;
    private double length;

    //Create a Rectangle Object
    public Rectangle(){
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);

        this.width = width;
        this.length = length;
    }
    //Get the width
    public double getWidth() {
        return width;
    }

    //Set the width
    public void setWidth(double width) {
        this.width = width;
    }

    //Get the length
    public double getLength() {
        return length;
    }

    //Set the length
    public void setLength(double length) {
        this.length = length;
    }

    //Calculate the area
    public double getArea(){
        return width*length;
    }

    //Calculate the perimeter
    public double getPerimeter(){
        return ((width*2) + (length*2));
    }

    //Convert the object to a string
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Rectangle[" + super.toString() + ", width = " + width + ", length = " + length + "]");
    }
}
