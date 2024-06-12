

public class Point {
    private float x;
    private float y;

    //Constructor to set defualt values for the point
    public Point(){
        this.x = 0.0f;
        this.y = 0;
    }

    ////Constructor to set values using two integers
    public Point(float x, float y){
        this.x =x;
        this.y=y;

    }

    //Get the value of x
    public float getX() {
        return x;
    }

    //Get the value of y
    public float getY() {
        return y;
    }

    //Set the value of x
    public void setX(float x) {
        this.x = x;
    }

    //Set the value of y
    public void setY(float y) {
        this.y = y;
    }

    //Set values for both X and Y
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        float point [] = {x, y};
        return point;
    }

    //Method to format the values into a string
    public String toString() {
        return ("x: " + this.x + " y: " + this.y);
    }

    
}
