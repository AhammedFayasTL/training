package practice;
import java.util.Scanner;
public class arithmeticCalculator {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double num1, num2, result;
			int op;
			System.out.println("Arithmetic Calculator\n------------------------");
			while (true) {

				System.out.print("Enter First Number  : ");
				num1 = sc.nextInt();
				System.out.print("Enter Second Number : ");
				num2 = sc.nextInt();
				System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
				System.out.print("Enter your choice : ");

				op = sc.nextInt();

				switch (op) {
				case 1:
					result = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + result);
					break;
				case 2:
					result = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + result);
					break;
				case 3:
					result = num1 * num2;
					System.out.println(num1 + " * " + num2 + " = " + result);
					break;
				case 4:
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
					break;
				case 5:
					result = num1 % num2;
					System.out.println(num1 + " % " + num2 + " = " + result);
					break;
				default:
					System.out.println("Invalid operator!");
					break;
				}

				System.out.println("Do you want to continue (Y/n)");
				char c = sc.next().charAt(0);
				if (c == 'n' || c == 'N') {
					break;

				}

			}
		}
	}



