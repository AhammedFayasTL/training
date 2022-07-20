package practice;

//create an abstract class 
abstract class ab {
	abstract void display();
	{
		System.out.println("Hellow!");
	}
}

public class anonymousInnerClass {
	public static void main(String[] args) {

		ab obj = new ab() {
			void display() {
				System.out.println("This is an Anonymous Inner Class");
			}
		};
		obj.display();
	}

}
