package aplikacija;

import java.util.Scanner;

 

public class Izbornik {

	private ObradaProizvod obradaProizvod;
	private ObradaUsluga obradaUsluga;
	private ObradaKupac obradaKupac;
	private ObradaRacun obradaRačun;

	public Izbornik() {
		obradaProizvod = new ObradaProizvod();
		obradaUsluga = new ObradaUsluga();
		obradaKupac = new ObradaKupac();
		obradaRačun = new ObradaRacun();
		Pomocno.ulaz = new Scanner(System.in);
		pozdravnaPoruka();
		prikaziIzbornik();
		Pomocno.ulaz.close();
	}

	private void pozdravnaPoruka() {
		System.out.println("*************************************");
		System.out.println("*** Pozdravna poruka, pozdrav     ***");
		System.out.println("*************************************");
	}

	private void prikaziIzbornik() {
		System.out.println("Glavni izbornik");
		System.out.println("1. Proizvodi");
		System.out.println("2. Usluge");
		System.out.println("3. Kupci");
		System.out.println("4. Računi");
		System.out.println("5. Izlaz iz programa");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {

		switch (Pomocno.unosRasponBroja("Odaberi stavku izbornika: ", "Obavezno 1-5", 1, 5)) {
		case 1:
			obradaProizvod.prikaziIzbornik();
			prikaziIzbornik();
			break;
		case 2:
			obradaUsluga.prikaziIzbornik();
			prikaziIzbornik();
			break;
		case 3:
			obradaKupac.prikaziIzbornik();
			prikaziIzbornik();
			break;
		case 4:
			obradaRačun.prikaziIzbornik();
			prikaziIzbornik();
			break;
		case 5:
			System.out.println("Doviđenja");
			break;

		}

	}

	public ObradaProizvod getObradaProizvod() {
		return obradaProizvod;
	}

	public ObradaUsluga getObradaUsluga() {
		return obradaUsluga;
	}

	public ObradaKupac getObradaKupac() {
		return obradaKupac;
	}

	public ObradaRacun getObradaRačun() {
		return obradaRačun;
	}

}
