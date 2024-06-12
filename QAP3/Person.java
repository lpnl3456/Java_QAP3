public class Person {
    //Define the veriables
    protected String myName ;  
    protected int myAge;  
    protected String myGender; 

    //create a person object
    public Person(String name, int age, String gender) {

        myName = name; 
        myAge = age ; 
        myGender = gender; }

        //Get the age
        public int getMyAge() {
            return myAge;
        }

        //Set the age
        public void setMyAge(int myAge) {
            this.myAge = myAge;
        }

        //Get the Gender
        public String getMyGender() {
            return myGender;
        }
        
        //Set the gender
        public void setMyGender(String myGender) {
            this.myGender = myGender;
        }
    
        //Get the name
        public String getMyName() {
            return myName;
        }
    
        //Set the name
        public void setMyName(String myName) {
            this.myName = myName;
        }

    //Convert the object to a string
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " +myGender; 
    }

   
}
