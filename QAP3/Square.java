public class Square extends Rectangle{

    //Create a squre
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    //Get the side of the square
    public double getSide(){
        return super.getWidth();
    }

    //Set the width and kegnth of the square
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    //Set the width and kegnth of the square
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    //Convert the object to a string
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Square[" + super.toString() + "]]");
    }
}
