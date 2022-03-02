
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    // ToDo 1: Make this class a child of Human
    
    protected int gpa;
    protected int credits;
    Student(String name, short age, int credits) {
       super(name, age);
       this.credits = credits;
    }
    // ToDo 2: Fix the resulting errors
    @Override
    public String getAddress() {
        return this.address;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    public void setGpa(int gpa){
        this.gpa = gpa;
    }
    
    public int getGpa(){
        return this.gpa;
    }
    // ToDo 4: Add comments to your code

}