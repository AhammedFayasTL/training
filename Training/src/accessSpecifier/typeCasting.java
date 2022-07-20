package accessSpecifier;

public class typeCasting {
	// defining main method
	public static void main(String args[]) {
		// declaring and initialize different data type variables
		int n = 10;
		double d = 2.8;
		char c = 'm';
		long l = 189000;
		// implicit type casting
		int ctn = c;
		double ntd = n;
		double ctd = c;
		long ntl = n;
		long ctl = c;
		// explicit type casting
		int dtn = (int) d;
		int ltn = (int) l;
		// print
		System.out.println("---implicit type casting---");
		System.out.println("Character " + c + " to integer " + (ctn));
		System.out.println("Integer " + n + " to double " + (ntd));
		System.out.println("Character " + c + " to double " + (ctd));
		System.out.println("Integer " + n + " to long " + (ntl));
		System.out.println("Character " + c + " to long " + (ctl));
		System.out.println("---Explicit type casting---");
		System.out.println("Double " + d + " to Int " + (dtn));
		System.out.println("Long " + l + " to integer " + (ltn));
	}
}