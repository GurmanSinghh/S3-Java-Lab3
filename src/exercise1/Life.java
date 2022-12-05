package exercise1;

public class Life extends Insurance {
	   Life() {
	       
	       super("Life Insurance");
	   }
	  

	   public void setInsuranceCost() {
	      
	       princePerMonth = 27;
	   }
	  
	   public double display() {
	       
	       System.out.println("Type of Insurance :"+getTypeOfInsurance());
	       System.out.println("Price per month :$"+getPricePerMonth());
	       
	       return getPricePerMonth();


	   }


}
