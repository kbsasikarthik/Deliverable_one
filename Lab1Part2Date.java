import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Java Program to find number of days between two dates in Java.
 * This program calculate difference between two dates in days 
 *
 * @author Sasi
 */

public class Lab1Part2Date {   
    
    private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    
    // main method signature
    public static void main(String args[]) throws ParseException{
    
        
      System.out.println("Please enter two dates in format yyyy/MM/dd to compare");
      Scanner reader = new Scanner(System.in);
      
      // get two dates from user in date format dd/mm/yyyy
      String first = reader.nextLine();
      String second = reader.nextLine();
      
      Date one = getDate(first);
      Date two = getDate(second);
      
      // quick way to find difference between two dates entered by the user; but not in all conditions
      // you can convert date into milliseconds then subtract
      // them and again convert it to days
      long numberOfDays = daysBetween(one, two); // milliseconds to days
      long diffYears = numberOfDays / 365; // days to years
      long diffMonths =((numberOfDays%365)/30); // remaining days to months
      long diffDays; // remaining months to days
      if(numberOfDays>=31)
    	  diffDays = diffMonths%30;
      else
    	  diffDays=numberOfDays;
    		
     // print the results
      System.out.printf("Difference between date %s and %s is : %d %n",
              first, second, numberOfDays);
      System.out.println("Years  -  "+ diffYears);
      System.out.println("Months - "+diffMonths);
      System.out.println("Days   - "+diffDays);
      
      reader.close();
    }
   
    
     // to parse String to date in Java
   
    private static Date getDate(String date) throws ParseException{
        return df.parse(date);
    }
    
   
     // Method signature to calculate difference between two dates in Java
     
    private static long daysBetween(Date one, Date two) {
        long difference =  (one.getTime()-two.getTime())/86400000;
        return Math.abs(difference);
    }
    
}
