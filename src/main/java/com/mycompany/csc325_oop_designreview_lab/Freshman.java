/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author maazh
 */
public class Freshman extends Student {
  
//    public Freshman(String name, short age, int credits){
//        if(credits < 85){
//            Student newStudent = new Student(name, age, credits);
//        }
//        else{
//            throw new UnsupportedOperationException("Cannot be registered in Freshman");
//        }
//    }
    public Freshman(String name, short age, int credits){
        super(name, age, credits);
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + "Address: " + this.address + "\n" +
                "Age: " + this.age + "\n" + "GPA: " + this.gpa + "\n" +
                "Credits: " + this.credits;
    }
}
