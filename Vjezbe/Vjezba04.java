package vjezba;

import java.util.Scanner;

public class Vjezba04 {

	public static void main(String[] args) {
		//Šesti zadatak
		int dec_num, qout, i = 1, j;
		int bin_num[] = new int[100];
		Scanner scan = new Scanner(System.in);

		System.out.print("Input a Decimal Number: ");
		dec_num = scan.nextInt();

		qout = dec_num;

		while (qout != 0) {

			bin_num[i++] = qout % 2;
			qout = qout / 2;
		}

		System.out.println("binary number is: ");
		for (j = i - 1; j > 0; j--) {
			System.out.print(bin_num[j]);
		}
		System.out.print("\n");

	}
}
