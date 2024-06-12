public class CollegeStudent extends Student{
    //Define the veriables
    protected String major;
    protected int year;

    //Create a CollegeStudent object
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) { 
        // use the super class’ constructor 
        super(name, age, gender,idNum,gpa);

        this.major = major;
        this.year = year;
    }

    //Set the major
    public void setMajor(String major) {
        this.major = major;
    }

    //Get the major
    public String getMajor() {
        return major;
    }

    //Set the year
    public void setYear(int year) {
        this.year = year;
    }

    //Get the year
    public int getYear() {
        return year;
    }

    //Convert the object to a string
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (super.toString() + ", major " + major + ", year " + year);
    }

}
