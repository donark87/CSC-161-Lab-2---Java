// Donark Patel
// Lab 2d
// Date: 1/31/2018

public class Lab2d

{
	public static void main (String [] args)
	{
		// Variables
		float prescriptionCost, coPay, netPay, insuranceCompanyPay; //prescriptionCost = Cost of prescription, coPay = Co-paid by customer,
		// netPay = Total amount customer will pay, insuranceCompanyPay = Total amount Insurance comapny will pay.
		int prescription;  //prescription = Total number of prescription per order.


		// assiments
		prescriptionCost = 65;
		coPay = 40;
		prescription = 23;

		// Calculation
		netPay = (prescription * coPay);
		insuranceCompanyPay = (prescriptionCost * prescription) - netPay;

		// Output
		System.out.println("prescription Cost  = " +prescriptionCost);
		System.out.println("Co-pay ammount  = " +coPay);
		System.out.println("Number of prescription  = " +prescription);
		System.out.println("Total amount due to customer  = " +netPay);
		System.out.println("Total amount due to Insurance Company  = " +insuranceCompanyPay);

		System.out.println("\n\n");
		System.out.println("\n\n");
		System.out.println("Donark patel");
		System.out.println("Lab1e");
		System.out.println("---------\n\n");
	}
}