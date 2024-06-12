public class MoveablePoint extends Point{
    //Define the veriables
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    //Create a MoveablePoint object
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){

        super(x,y);

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //Get the xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    //Set the xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    //Get the ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    //Set the YSpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //Set both x and y speed
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //Get both x and y speed
    public float [] getSpeed(){
        float speed [] = {xSpeed, ySpeed};
        return speed;
    }

    //Convert the object to a string
    @Override
    public String toString() {
        return (super.toString() + ", Speed = (" + xSpeed + ", " + ySpeed + ")");
    }
    
    public MoveablePoint move(){
        
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        
        return this;
    }
}
