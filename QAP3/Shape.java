public class Shape {
    //Define the veriables
    private String color;
    private boolean filled;

    //Create a Shape Object
    public Shape(){
    color = "red";
    filled = true;
    }

    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //Get the color
    public String getColor() {
        return color;
    }

    //Set the color
    public void setColor(String color) {
        this.color = color;
    }

    //Determine if the shape is filled
    public boolean isFilled() {
        return filled;
    }

    //Change wether the shape is filled or not
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Convert the object to a string
    public String toString() {
        // TODO Auto-generated method stub
        return ("Shape [color = " + this.color + ", filled = " + this.filled + "]");
    }
}
