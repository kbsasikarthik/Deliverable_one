

import java.util.Scanner;

public class NumberComparision {

    // main method declaration
	public static void main(String[] args) {
        
        // create an object of Scanner class
		Scanner ss = new Scanner(System.in);
        
        String choice = "y";
        
        // executes the following block of code only if choice is y or Y
        while (choice.equalsIgnoreCase("y")){
            
        	// get input from user for number 1 and check if it is an integer
            int num1 = getIntInRange(ss,"Enter first number  : ",1,999);
            
            //get input from user for number 1 and check if it is an integer
            int num2 = getIntInRange(ss,"Enter second number : ",1,999);
                    
            int hundreds =(num1/100)+(num2/100); // int hundreds = hundreds1+hundreds2;
            int tens = ((num1%100)/10)+((num2%100)/10);  // int tens = tens1+tens2;             
            int ones = (num1%10)+(num2%10); // int ones = ones1+ones2;
              
            if ((hundreds == tens) &&(tens == ones)){
                System.out.println("The total of place values are equal :-) !");
            }    
              else {
                System.out.println("The total of place values are not equal :-(");
            }
               
           
            System.out.print("Do you want to do it again? (y/n)? : ");
            choice=ss.next();
                  
        }
    } 
    
 /* getInt method signature. it checks if the user entered data is an integer or not
 and returns the integer value */
	
public static int getInt(Scanner ss, String stmt){
    int d =0;
    boolean validity = false;
    while (!validity){
        System.out.print(stmt);
        if(ss.hasNextInt()){
            d = ss.nextInt();
            validity = true;
            }
        else {
            System.out.println("Please enter a valid integer number!");
            }
        // clears the data entered by the user
        ss.nextLine();
    }
    return d;    
    
 
}

/* getIntRange method signature
 it gets 4 arguments from the calling method and returns a integer value
 this method checks if the user entered value is within range or not */
public static int getIntInRange(Scanner ss, String stmt, int min, int max){
    int d = 0;
    boolean validity = false;
    while (!validity){
        d = getInt(ss, stmt) ;
        // check if the entered value is greater than the minimum limit
        if (d<min){
            System.out.println("Please enter a number greater than " + min);
           }
        // check if the entered value is less than the maximum limit
        else if (d > max){
            System.out.println("Please enter a number less than "+ max);
           }
        else
         validity = true;
        }
   return d;
}

}
