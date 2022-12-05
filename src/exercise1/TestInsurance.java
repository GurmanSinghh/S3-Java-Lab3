package exercise1;
import java.util.Scanner;

public class TestInsurance {
	public static void main(String[] args) {
	      
        
       String insuranceType;
       int i =0;
      
       Scanner scanInput= new Scanner(System.in);
       
      
       Insurance arrayIns[] = new Insurance[2];
       
      
       System.out.println("Enter the insurance type ");
       System.out.println("Enter 'Health' for health insurnace");
       System.out.println("Enter 'Life' for life insurnace ");
       System.out.println("___________________________________\n");
       
     
       insuranceType = scanInput.next();
      
       while(i < 2) {
       //if the user enters "Health" then do this
        if(insuranceType.equalsIgnoreCase("Health")) {
            
           
            Health objHealth = new Health();    
            
          
           objHealth.setInsuranceCost();
          
           objHealth.display();
           
           arrayIns[i] = objHealth;
           
       }
        //if the user enters "Life" then do the following
       else if(insuranceType.equalsIgnoreCase("Life")) {
           
           //create an object of the class named Life
           Life objLife = new Life();
           
           //call the methods for setting the value
           objLife.setInsuranceCost();
           //call the method for displaying the result
           objLife.display();
           
           arrayIns[i] = objLife;
       
       }
       else if(insuranceType.equalsIgnoreCase("Exit")) {
           break;
       }
        else{
           //display error messages
           System.out.println("OOPS! The type of the insurance is not available");
           System.out.println("Please, provide correct input");
       }
       //display a message to ask the user to enter type of insurance
       System.out.println("Enter the type of insurance ");
       System.out.println("Enter 'Health' for health insurnace");
       System.out.println("Enter 'Life' for life insurnace ");
       System.out.println("Enter 'Exit' for life insurnace");
       System.out.println("___________________________________\n");
       
       //read and store the value in the variable
       insuranceType = scanInput.next();
       i++;
       }
       System.out.println("___________________________________\n");
      System.out.println("Ploymorphic screen manager for displaying result");
       System.out.println("___________________________________");
       for(i= 0; i<arrayIns.length; i++) {
           System.out.println(arrayIns[i].display());
       }
       
   }


}
