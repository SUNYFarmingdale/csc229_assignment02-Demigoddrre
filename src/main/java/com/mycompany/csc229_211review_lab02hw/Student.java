package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
   private Double gpa;

   
   // ToDo 1: Make this class a child of Person
    public Student(String name, int age) {
        super(name, age); // I used param super() since field signature of argumemts are the same
    }
   
	
	// ToDo 2: Fix the resulting errors
    //all abstract metods must be implemented in child class
	 @Override
   public String getAddress() {
      //  implementation for this abstract method
      return "Address not available";
   }
   
   @Override
   public void setAddress(String address) {
      //  implementation for this abstract method
      System.out.println("Setting address is not supported for Student class");
   }
	// ToDo 3: Add a field for GPA and create setter and getter
	public double getGpa() {
      return gpa;
   }
   
   public void setGpa(double gpa) {
      this.gpa = gpa;
   }
   
   @Override
   public String toString() {
   return String.format("Student{name='%s', age=%d, gpa=%f}", getName(), getAge(), gpa);
}

	// ToDo 4: Add comments to your code

}