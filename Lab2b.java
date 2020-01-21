// Donark Patel
// Lab 2b
// Template

public class Lab2b

{
	public static void main (String [] args)
	{
		// Variables
		float principal;
		float amountpaid;
		float intrestrate;
		float remainingbalance;
		float intrestamount;
		float totalamountdue;

		// assiments
		principal = 10000;
		amountpaid = 2500;
		intrestrate = 0.10f;


		// Calculation
		totalamountdue = (principal * intrestrate);
		intrestamount = (totalamountdue - principal);
		remainingbalance = (principal - amountpaid)+ totalamountdue;


		// Output
		System.out.println("principal amount of the Loan = $ " + principal);
		System.out.println("Intrest rate of the Loan = " + intrestrate*100 + "%");
		System.out.println("Amount Paid = $ " + amountpaid);

		System.out.println("Intrest Amount in $ = $ " + totalamountdue);
		System.out.println("Remaining balance = $ " + remainingbalance);
		System.out.println("\n\n");
		System.out.println("\n\n");
		System.out.println("Donark patel");
		System.out.println("Lab2b");
		System.out.println("\n\n");
	}
}