// Donark Patel
// Lab 2a
// Lab2a

public class Lab2a

{
	public static void main (String [] args)
	{
		// Variables
		int DarkHeight; // Side A
		int DarkBase;   // Side B
		int WhiteHeight;  // Side C
		int WhiteBase;	// Side D
		int NumberofHorizontalboxDark;   //Number of horizontal box on darker box
		int NumberofHorizontalboxWhite; 	//Number of horizontal box on white box
		int NumberofVerticalBoxDark;	 //Number of Vertical box on darker box
		int NumberofVerticalBoxWhite;		//Number of Vertical box on white box
		int Area;

		// assiments
		DarkHeight = 6;
		DarkBase = 5;
		WhiteHeight = 1;
		WhiteBase = 1;
		NumberofHorizontalboxDark =3;
		NumberofHorizontalboxWhite = 1;
		NumberofVerticalBoxDark = 3;
		NumberofVerticalBoxWhite = 1;

		// Calculation
		Area = (DarkHeight * DarkBase) * (NumberofHorizontalboxDark * NumberofVerticalBoxDark) - (WhiteBase * WhiteHeight) * (NumberofHorizontalboxWhite * NumberofVerticalBoxWhite);


		// Output
		System.out.println("Dark Box Height = " + DarkHeight);
		System.out.println("Dark Box Base = " + DarkBase);
		System.out.println("Number of Horizontal Boxes in Dark Box = " + NumberofHorizontalboxDark);
		System.out.println("Number of Verical Boxes in Dark Box = " + NumberofVerticalBoxDark);

		System.out.println("Number of Horizontal Boxes in White Box = " + NumberofHorizontalboxWhite);
		System.out.println("Number of Verical Boxes in White Box = " + NumberofVerticalBoxWhite);

		System.out.println("Area = " + Area);

		System.out.println("---------\n\n");

		System.out.println("Donark patel");
		System.out.println("Lab2A");
		System.out.println("---------\n\n");
	}
}
