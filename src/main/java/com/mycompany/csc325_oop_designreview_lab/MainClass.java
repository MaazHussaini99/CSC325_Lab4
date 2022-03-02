/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) throws Exception {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
                
                // Todo 7: Create two classes for Freshman and Senior 
                
                // ToDo 8: The senior class should have a minimum of 85 credits  
		
		// ToDo 9: Add a toString method for Freshman class
		
                // ToDo 10: Add a toString method for Senior class
                
		Student std1= new Freshman("James", (short)20, 12); // name, age, credits
                std1.setAddress("123 Wow St.");
                Student std2 = new Senior("John", (short)30, 90);
		std2.setAddress("123 Your Ave.");
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your GPA for std1: ");
                int gpa = sc.nextInt();
		std1.setGpa(gpa);
                
                System.out.println("Enter your GPA for std2: ");
                gpa = sc.nextInt();
		std2.setGpa(gpa);
            
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}