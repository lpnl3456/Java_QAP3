public class Student extends Person{
    //Define the veriables
    protected String myIdNum; 
    protected double myGPA; 

    //Create a Student object
    public Student(String name, int age, String gender, String idNum, double gpa) { 
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
        }

        //Set the GPA
        public void setMyGPA(double myGPA) {
            this.myGPA = myGPA;
        }

        //Set the IdNUM
        public void setMyIdNum(String myIdNum) {
            this.myIdNum = myIdNum;
        }

        //Get the GPA
        public double getMyGPA() {
            return myGPA;
        }

        //Get the IdNum
        public String getMyIdNum() {
            return myIdNum;
        }

        //Convert the object to a string
        @Override
        public String toString() {
            // TODO Auto-generated method  stub
            return (super.toString() + " ID Number " + myIdNum  + " GPA " + myGPA);
        }
}
