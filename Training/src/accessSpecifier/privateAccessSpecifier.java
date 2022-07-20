package accessSpecifier;


	class priaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class privateAccessSpecifier {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        //obj.display(); --> failure

		}
}
