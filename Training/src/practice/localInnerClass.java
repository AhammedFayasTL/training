package practice;

public class localInnerClass {
	private String str = "Hi!";

	void show() {
		class inner {
			void display() {
				System.out.println(str + " " + "This is Local Inner Class");
			}

		}
		inner obj1 = new inner();
		obj1.display();
	}

	public static void main(String[] args) {
		localInnerClass obj = new localInnerClass();
        obj.show();
	}

}
