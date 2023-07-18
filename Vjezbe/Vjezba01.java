package vjezba;

import java.util.Scanner;

public class Vjezba01 {

	public static void main(String[] args) {

		// Prvi zadatak
		final double width = 5.6;
		final double height = 8.5;

		double perimeter = 2 * (height + width);

		double area = width * height;

		System.out.printf("perimeter is 2*(%.1f + %.1f) %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f = %.2f\n", width, height, area);
		System.out.println("-----------------------");

		// Drugi zadatak
		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int num1 = in.nextInt();

		System.out.print("Input second number: ");
		int num2 = in.nextInt();

		System.out.print("Input thrd number: ");
		int num3 = in.nextInt();

		System.out.print("Input forth number: ");
		int num4 = in.nextInt();

		System.out.print("Input fifth number: ");
		int num5 = in.nextInt();

		System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
		System.out.println("-----------------------");

		// Treći zadatak
		int a, b, temp;
		a = 15;
		b = 27;
		System.out.println("Before swaping : a, b = " + a + ", " + +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : a, b = " + a + ", " + +b);
		System.out.println("-----------------------");

	}

}
