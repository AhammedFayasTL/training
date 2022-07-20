package practice;

public class staticInnerClass {
	//Static class
	static class inner{
		public void display() {
			System.out.println("This is Static Inner Class");
		}
	}

	public static void main(String[] args) {
		staticInnerClass.inner obj = new staticInnerClass.inner();
		obj.display();
		
	}

}
