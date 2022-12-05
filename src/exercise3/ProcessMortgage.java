package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
	public static void main(String[] args) {
	      
        Mortgage mortgages[] = new Mortgage[3];
        
        double interest_rate;
        int mortgage_number;
        String customer_name;
        double mortgage_amount;
        int term;
        String mortgage_type;
        Scanner scan = new Scanner(System.in);
        
        System.out.print(" Enter current interest rate : ");
        interest_rate =scan.nextDouble();
        scan.nextLine();
        
        for(int i=0;i<mortgages.length;i++)
        {
               System.out.print(" Mortgage Type (Personal or Business) : ");
               mortgage_type = scan.nextLine();
               while(!mortgage_type.equalsIgnoreCase("Personal") && !mortgage_type.equalsIgnoreCase("Business"))
               {
                      System.out.print(" Invalid Mortgage type. Mortgage Type (Personal or Business) : ");
                      mortgage_type = scan.nextLine();
               }
               
               System.out.print(" Mortgage Number : ");
               mortgage_number = scan.nextInt();
               scan.nextLine();
               System.out.print(" Customer Name : ");
               customer_name = scan.nextLine();
               System.out.print(" Mortgage Amount : ");
               mortgage_amount = scan.nextDouble();
               System.out.print(" Term : ");
               term = scan.nextInt();
               scan.nextLine();
               
               if(mortgage_type.equalsIgnoreCase("Personal"))
                      mortgages[i] = new PersonalMortgage(mortgage_number,customer_name,mortgage_amount,interest_rate,term);
               else
                      mortgages[i] = new BusinessMortgage(mortgage_number,customer_name,mortgage_amount,interest_rate,term);
        }
        
        System.out.println(" Details of Mortgages : ");
        for(int i=0;i<mortgages.length;i++)
        {
               mortgages[i].getMortgageInfo();
               System.out.println();
        }
        scan.close();
  }


}
