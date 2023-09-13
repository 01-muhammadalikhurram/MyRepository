public class Printf{

	public static void main(String[] args) {
	
		// System.out.printf("This is a %d formated String ",123);

		System.out.printf("This is a %d formated String \n",123);

		boolean myBool = true;
		char myChar = 'A';
		String myString = "Muhammad Ali";
		int myInt  = 50;
		double myDouble = 109000000655754456.0;

		//Conversion Character (b,c,s,d,f)
		System.out.printf("This is a %b formated String with a boolean value \n",myBool);
		System.out.printf("This is a %c formated String with a char value \n",myChar);
		System.out.printf("This is a %s formated String with a String value \n",myString);
		System.out.printf("This is a %d formated String with a int value \n",myInt);
		System.out.printf("This is a %f formated String with a Double value \n",myDouble);

		//Width (Minimum number of characters to display as output)
		System.out.printf("This is a %50s formated String with a String value \n",myString);
		//left justify
		System.out.printf("This is a %-50s formated String with a String value \n",myString);
		//precision
		System.out.printf("This is a %.2f formated String with a Double value \n",myDouble);
		//commas
		System.out.printf("This is a %,.2f formated String with a Double value \n",myDouble);

	}

}