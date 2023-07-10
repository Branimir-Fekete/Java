package ciklicna;

public class Ciklicna {

	public static void main(String[] args) {

		int r = 5;
		int s = 5;
		int[][] matrica = new int[r][s];

		int broj = 1;
		int minRed = 0;
		int maxRed = r - 1;
		int minStupac = 0;
		int maxStupac = s - 1;

		while (broj <= r * s) {
			for (int i = minStupac; i <= maxStupac; i++) {
				matrica[minRed][i] = broj++;
			}
			minRed++;

		

		for (int i = minRed; i <= maxRed; i++) {
			matrica[i][maxStupac] = broj++;
		}
		maxStupac--;

		for (int i = maxStupac; i >= minStupac; i--) {
			matrica[maxRed][i] = broj++;
		}
		maxRed--;

		for (int i = maxRed; i >= minRed; i--) {
			matrica[i][minStupac] = broj++;
		}
		minStupac++;
		}
	

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}

	}

}