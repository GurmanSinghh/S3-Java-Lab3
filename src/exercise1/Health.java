package exercise1;

public class Health extends Insurance {
	public Health() {
	       super("Health Insurance");
	   }
	  
	  
	   public void setInsuranceCost() {
	      
	       princePerMonth = 180;
	      
	   }
	   
	   public double display() {


	       System.out.println("Type of Insurance :"+getTypeOfInsurance());
	       System.out.println("Price per month :$"+getPricePerMonth());
	       
	       return getPricePerMonth();
	   }



}
