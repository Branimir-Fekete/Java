package ciklicna;

import java.util.Scanner;

public class Ciklicna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Unesite broj redaka: ");
		int redaka = scanner.nextInt();

		System.out.print("Unesite broj stupaca: ");
		int stupaca = scanner.nextInt();

		int[][] matrica = new int[redaka][stupaca];
		int brojElemenata = redaka * stupaca;

		if (brojElemenata > 0) {
			int broj = 1;
			int minRed = 0;
			int maxRed = redaka - 1;
			int minStupac = 0;
			int maxStupac = stupaca - 1;

			while (broj <= brojElemenata) {
				for (int i = minStupac; i <= maxStupac; i++) {
					matrica[minRed][i] = broj++;
				}
				minRed++;

				for (int i = minRed; i <= maxRed; i++) {
					matrica[i][maxStupac] = broj++;
				}
				maxStupac--;

				if (broj <= brojElemenata) {
					for (int i = maxStupac; i >= minStupac; i--) {
						matrica[maxRed][i] = broj++;
					}
					maxRed--;
				}

				if (broj <= brojElemenata) {
					for (int i = maxRed; i >= minRed; i--) {
						matrica[i][minStupac] = broj++;
					}
					minStupac++;
				}
			}

			// Ispisivanje matrice
			for (int i = 0; i < redaka; i++) {
				for (int j = 0; j < stupaca; j++) {
					System.out.print(matrica[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Unijeli ste neispravne dimenzije matrice.");
		}

	}

}