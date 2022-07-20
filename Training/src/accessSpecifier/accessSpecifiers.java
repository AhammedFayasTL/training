package accessSpecifier;

public class accessSpecifiers {
	public void accessPublic() {
		System.out.println("This is public method");
	}

	private void accessPrivate() {
		System.out.println("This is private method");
	}

	void accessDefault() {
		System.out.println("This is default method");
	}

	protected void accessProtected() {
		System.out.println("This is protected method");
	}

	public static void main(String[] args) {

		accessSpecifiers obj = new accessSpecifiers();
		obj.accessPublic();
		obj.accessPrivate();
		obj.accessDefault();
		obj.accessProtected();
	}
}
