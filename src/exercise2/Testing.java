package exercise2;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Please enter type of Game tester want to create - ");
			System.out.println("P: for part time");
			System.out.println("F: for full time");
			String choice = scan.nextLine();
			if(choice.equalsIgnoreCase("P"))
			{
				PartTimeGameTester partTime = new PartTimeGameTester();
				System.out.println("Please enter total hour of the parttime tester");
				double hours = Double.parseDouble(scan.nextLine());
				partTime.isFullTime = false;
				partTime.setTotalHours(hours);
				System.out.println("Part-time salary : "+partTime.calculateSalary());
			}
			else if(choice.equalsIgnoreCase("F"))
			{
				FullTimeGameTester fullTime = new FullTimeGameTester();
				fullTime.isFullTime = true;
				System.out.println("Full time tester salary : "+fullTime.calculateSalary());
			}
			else
			{
				System.out.println("Invalid choice, try again");
				continue;
			}
			System.out.println("Do you want to continue (y/n)");
			String next = scan.nextLine();
			if(next.equalsIgnoreCase("y"))
			{
				continue;
			}
			else
			{
				return;
			}
		}


	}


}
