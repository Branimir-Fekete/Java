package vjezba;

import java.io.Console;

public class Vjezba07 {

	public static void main(String[] args) {
		// deveti zadatak
		int chr = 'A';
		System.out.println("The ASCII value of Z is: " + chr);

		System.out.println("*************************************");

		// Deseti zadatak
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
		System.out.println("*************************************");

		// Jedanaesti zadatak
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your password: ");

				System.out.println("Your password was " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Cant get password.... no console");
		}

	}
}
