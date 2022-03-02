/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author maazh
 */
public class Senior extends Student {
    public Senior(String name, short age, int credits)throws Exception{
        
        super(name, age, credits);
        if (credits < 85) {
            System.out.println("Sorry, but you do not have enough credits");
            throw new Exception("Not enough Cedits.");
        }
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + "Address: " + this.address + "\n" +
                "Age: " + this.age + "\n" + "GPA: " + this.gpa + "\n" +
                "Credits: " + this.credits;
    }
}
