package exercise3;

public class PersonalMortgage extends Mortgage{
    public PersonalMortgage(int mortgage_number, String customer_name, double mortgage_amount, double interest_rate, int term)
    {
          super(mortgage_number,customer_name,mortgage_amount,(interest_rate+2),term);
    }

}
	
	   



