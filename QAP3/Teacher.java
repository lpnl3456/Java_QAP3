public class Teacher extends Person{
    //Define the veriables
    protected String subject;
    protected double salary;

    //Create a teacher object
    public Teacher(String name, int age, String gender, String subject, double salary) { 
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
        }

        //Set the subject
        public void setSubject(String subject) {
            this.subject = subject;
        }

        //Get the subject
        public String getSubject() {
            return subject;
        }

        //Get the salary
        public double getSalary() {
            return salary;
        }

        //Set the salary
        public void setSalary(double salary) {
            this.salary = salary;
        }

        //Convert the object to a string
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return (super.toString() + ", subject: " + subject + ", salary $" + salary);
        }
}
