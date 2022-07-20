package practice;

class test {
	String vegetable, color;
	int price;

	test(String a, String b, int c) {
		this.vegetable = a;
		this.color = b;
		this.price = c;
	}

	void show() {
		System.out.println("Vegetable name : " + vegetable + " " + " Color :" + color + " " + " Price :" + price);
		// System.out.println("------------------------------------");

	}

}

public class constructorExample {
	public static void main(String[] args) {
		test obj1 = new test("Tomato", "Red", 100);
		test obj2 = new test("Brinjal", "Violet", 50);
		test obj3 = new test("Cabage", "Green", 35);
		obj1.show();
		obj2.show();
		obj3.show();
		System.out.println(obj3.price);
	}
}