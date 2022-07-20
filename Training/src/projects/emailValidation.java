package projects;

import java.util.*;

public class emailValidation {
	public static void validate(String email, ArrayList<String> list) {
		if (list.contains(email) == false)
			System.out.println(email + " is not in the given list");
		else
			System.out.println(email + " is present in the given List");
	}

	public static void main(String[] args) {
		ArrayList<String> emailList = new ArrayList<String>();
		emailList.add("maruthy76@gmail.com");
		emailList.add("honda01@gmail.com");
		emailList.add("scania@gmail.com");

		System.out.println("Enter an email id for validation : ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		validate(email, emailList);
	}
}
