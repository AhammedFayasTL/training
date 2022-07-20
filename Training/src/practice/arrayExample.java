package practice;

import java.util.Scanner;

public class arrayExample {
	static int arr[] = new int[10];
	static int arr1[][] = new int[10][10];

	public static void main(String[] args) {

		System.out.println("Enter how many array elements :");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elemts Are : ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
}
