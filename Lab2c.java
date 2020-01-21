// Donark Patel
// Lab 2c
// Date: 1/31/2018

public class Lab2c

{
	public static void main (String [] args)
	{
		// Variables
		float deductible, iPayCoPay;  					//iPayCoPay is co-pay amount that client will pay (Not including deductible).
		float coPay, companyPay, companyCoPay; 			//companyPay is amount that company will pay after client deductible(not including co-pay).
		float totalCharges;								//Totalcharges = total amount of claim.
		float totalPay, totalCompanyPay; 				//totalPay = Total amount client will pay for this claim.


		// assiments
		deductible = 1000;
		coPay= 0.20f;
		totalCharges = 5000;




		// Calculation
		companyPay = totalCharges - deductible;
		iPayCoPay = companyPay * coPay;
		totalPay = iPayCoPay + deductible;
		totalCompanyPay = totalCharges - totalPay;

		// Output
		System.out.println("Total amount of claim   	    = " +totalCharges);
		System.out.println("Deductable amount                   = " +deductible);
		System.out.println("Claim ammount after deductible      = " +companyPay);
		System.out.println("Client's Co-pay                     = " +coPay*100 +"%");
		System.out.println("Total amount client pays            = " +totalPay);
		System.out.println("Total amount insurance company pays = " +totalCompanyPay);
		System.out.println("\n\n");
		System.out.println("\n\n");
		System.out.println("Donark patel");
		System.out.println("Lab2b");
		System.out.println("\n\n");
	}
}