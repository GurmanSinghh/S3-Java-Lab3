package exercise2;

public class PartTimeGameTester extends GameTester{
	private double hourlyRate = 20;
	private double totalHours;
	@Override
	public double calculateSalary() {
		double partTimesalary = hourlyRate*totalHours;
		return partTimesalary;
	}


	public double getTotalHours() {
		return totalHours;
	}


	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}
	


}
