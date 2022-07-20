package practice;

public class memberInnerClass {
	private String s = "Hello!";
	class inner{
		void display() {
	    	System.out.println(s+"  " +"This is Member Inner Class.");
	    }
	}
    
	public static void main(String[] args) {
		memberInnerClass obj1 = new memberInnerClass();
		memberInnerClass.inner obj2 = obj1.new inner();
        obj2.display();
	}

}
