//package com.candidjava.time;

import java.util.Scanner;
/*import java.text.ParseException;
import java.time.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calender;
import java.util.Date;
*/
public class HealthProfileTest
{
  public static void main(String [] args)
  {
    String fN = "", lN = "", gen = "";
    double ht = 0.0, wt = 0.0; 
    int mm = 0, dd = 0, yy = 0;
    
    Scanner input = new Scanner(System.in);
   
    HealthProfile obj = new HealthProfile(fN, lN, gen,
    ht, wt, mm, dd, yy);
    
    //System.out.print("Enter first name: ");
    String fName = input.next();
    obj.setFirst(fName);
    //System.out.println();
    
    //System.out.print("Enter last name: ");
    String lName = input.next();
    obj.setLast(lName);
    //System.out.println();
    
    //System.out.print("Enter gender: ");
    String gender1 = input.next();
    obj.setGender(gender1);
    //System.out.println();
    
    //System.out.print("Enter month of birth: ");
    int month_ = input.nextInt(); 
    obj.setMonth(month_);
    //System.out.println();
      
   // System.out.print("Enter day of birth: ");
    int day_ = input.nextInt();
    obj.setDay(day_);
    //System.out.println();
    
    //System.out.print("Enter year of birth: ");
    int year_ = input.nextInt();
    obj.setYear(year_);
    
    //System.out.print("Enter height inches: ");
    double height1 = input.nextDouble();
    obj.setHeight(height1);
    //System.out.println();
    
   // System.out.print("Enter weight in pounds: ");
    double weight1 = input.nextDouble();
    obj.setWeight(weight1);
    //System.out.println();
    
    
    //System.out.println();
         
    System.out.printf("HEALTH PROFILE FOR: %s", obj.getFirst(), " %s");
    System.out.printf(" %s", obj.getLast());
    System.out.println();
    
    System.out.printf("Gender:");
    System.out.print(" " + obj.getGender());
    System.out.println();
    
    System.out.printf("Age: %d", obj.getAge());
    System.out.println();
    
    System.out.printf("Height (in inches): %.1f", obj.getHeight());
    System.out.println();
    
    System.out.printf("Weight (in pounds): %.1f", obj.getWeight());
    System.out.println();
    
    int maxHR = 220 - obj.getAge();
    System.out.printf("Maximum heart rate: %d", maxHR);
    System.out.println();
    
    System.out.print("Target heart rate range:");
    System.out.println();
    
    double min = maxHR * .50;
    double max = maxHR * .85;
    System.out.printf("   Minimum: %.0f", min);
    System.out.println();
    System.out.printf("   Maximum: %.0f", max);
    
    double bmi = ((obj.getWeight())*(703))/((obj.getHeight())*(obj.getHeight()));
    
    System.out.println();
    System.out.printf("BMI: %.6f", bmi);
    System.out.println();
    System.out.println();
    
    System.out.println("BMI VAlUES");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal:      between 18.5 and 24.5");
    System.out.println("OverWeight:  between 25 and 29.9");
    System.out.println("Obese:       30 or greater");
    
    
  }
  
}