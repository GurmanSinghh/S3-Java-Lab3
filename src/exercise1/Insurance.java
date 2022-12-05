package exercise1;

public abstract class Insurance {
	
	   public String typeOfInsurance;
	   
	   public double princePerMonth;
	   
	  
	   public Insurance(String typeOfInsurance) {
	       
	       this.typeOfInsurance = typeOfInsurance;
	   }
	  	   public String getTypeOfInsurance() {
	       
	       return typeOfInsurance;
	   }
	    
	   public double getPricePerMonth() {
	       
	       return princePerMonth;
	   }
	   
	    
	   public abstract void setInsuranceCost();
	   public abstract double display();
	}



