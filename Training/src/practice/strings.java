package practice;

public class strings {
	public static void main(String[] args) {
		String s = "Java "; // literal
		String str = new String("Programming"); // object

		System.out.println("String : " + str);
		System.out.println("String " + str + " can have length : " + str.length());
		// StringBuffer
		StringBuffer sbr = new StringBuffer("Python ");
		System.out.println("After string Buffer method " + str + " changes to " + sbr.append(str));
		System.out.println("length : " + sbr.length());
		// StringBuilder
		StringBuilder sbu = new StringBuilder("Object oriented ");
		System.out.println("After String Builder method " + str + " changes to " + sbu.append(str));
		System.out.println("length : " + sbu.length());//

	}
}
