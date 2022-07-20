package practice;

public class methodExample {

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public void fun(String s) {
		String c= "java";
		System.out.println(s.concat(c));
	}

	protected void hello() {
		System.out.println("Method Succesfully called..!");
	}

	public static void main(String[] args) {
		methodExample obj = new methodExample();
		int ans = obj.add(20, 40);
		System.out.println(ans);
		obj.hello();
		obj.fun("Iam intrested in ");
	}

}