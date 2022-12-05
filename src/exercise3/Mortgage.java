package exercise3;

public abstract class Mortgage implements MortgageConstants{
    private int mortgage_number;
    private String customer_name;
    private double mortgage_amount;
    private double interest_rate;
    private int term;
    
    public Mortgage(int mortgage_number, String customer_name, double mortgage_amount, double interest_rate, int term)
    {
          this.mortgage_number = mortgage_number;
          this.customer_name = customer_name;
          if(mortgage_amount > max_mortgage_amt)
                 this.mortgage_amount = max_mortgage_amt;
          else
                 this.mortgage_amount = mortgage_amount;
          this.interest_rate = interest_rate;
          if(term != short_term && term != medium_term && term != long_term)
                 this.term = short_term;
          else
                 this.term = term;
    }
    
    public void getMortgageInfo()
    {
          System.out.println(" Bank Name : "+bank_name);
          System.out.println(" Mortgage Number : "+mortgage_number);
          System.out.println(" Customer Name : "+customer_name);
          System.out.println(" Mortgage Amount : "+mortgage_amount);
          System.out.println(" Interest rate : "+interest_rate+" % " );
          System.out.println(" Term : "+term);
          double amount_owed = mortgage_amount + (mortgage_amount*interest_rate*term)/100; // interest is simple interest
          System.out.println(" Total amount owed after "+term+" years : "+amount_owed);
    }
}



