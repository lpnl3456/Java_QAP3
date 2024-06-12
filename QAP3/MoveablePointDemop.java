public class MoveablePointDemop {
    public static void main(String[] args) {

       // create moveablePoint objects
        MoveablePoint m1 = new MoveablePoint(5,8);

        MoveablePoint m2 = new MoveablePoint(7,9,6.8f,8.2f);

        //Display MoveablePoint objects

        System.out.println("m1: " + m1.toString());
        System.out.println("m2: " + m2.toString());

        // change the speed for m1 and m2

        m1.setXSpeed(10.09f);
        m1.setYSpeed(9.1f);

        m2.setSpeed(7.89f, 11.02f);

        // Display the new x and y speeds
        System.out.println("m1: " + m1.toString());
        System.out.println("m2: " + m2.toString());

        m1.move();
        m2.move();

        //Display the changes to the point object

        System.out.println("m1: " + m1.toString());
        System.out.println("m2: " + m2.toString());


    }
}
