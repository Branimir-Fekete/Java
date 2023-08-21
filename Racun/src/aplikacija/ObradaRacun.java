package aplikacija;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aplikacija.model.Racun;

public class ObradaRacun {

	private List<Racun> racuni;

	public List<Racun> getRacuni() {
		return racuni;
	}

	public ObradaRacun() {
		racuni = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		racuni.add(new Racun(1, 25, new Date(), "Opis plaćanja 1", 1, 1, 1));
	    racuni.add(new Racun(2, 20, new Date(), "Opis plaćanja 2", 2, 2, 2));
	}

	public void prikaziIzbornik() {
		System.out.println("Račun izbornik");
		System.out.println("1. Pregled postojećih računa");
		System.out.println("2. Unos novog računa");
		System.out.println("3. Promjena postojećeg računa");
		System.out.println("4. Brisanje postojećeg računa");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku račun izbornika: ", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledRacuna();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeRacuna();
			prikaziIzbornik();
			break;
		case 3:
			promjenaRacuna();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeRacuna();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}

	public void pregledRacuna() {
		System.out.println("-------------------");
		System.out.println("---- Računi ----");
		System.out.println("-------------------");
		int b = 1;
		for (Racun r : racuni) {
			System.out.println(b++ + ". ID: " + r.getId() + ", PDV: " + r.getPDV());
		}
		System.out.println("-------------------");
	}

	private void dodavanjeRacuna() {
		Racun r = new Racun();
		r.setId(Pomocno.unosRasponBroja("Unesi ID računa: ", "Pozitivan broj", 1, Integer.MAX_VALUE));
		r.setPDV(Pomocno.unosRasponBroja("Unesi iznos PDV-a: ", "Pozitivan broj", 0, Integer.MAX_VALUE));
		// Dodaj unos za vrijeme izdavanja, opis plaćanja, kupacId, uslugaId i
		// proizvodId
		racuni.add(r);
	}

	private void promjenaRacuna() {
		pregledRacuna();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj računa: ", "Nije dobar odabir", 1, racuni.size());
		Racun r = racuni.get(index - 1);
		r.setId(Pomocno.unosRasponBroja("Unesi ID računa (" + r.getId() + "): ", "Pozitivan broj", 1,
				Integer.MAX_VALUE));
		r.setPDV(Pomocno.unosRasponBroja("Unesi iznos PDV-a (" + r.getPDV() + "): ", "Pozitivan broj", 0,
				Integer.MAX_VALUE));
		// Dodaj unos za ostale atribute računa
	}

	private void brisanjeRacuna() {
		pregledRacuna();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj računa: ", "Nije dobar odabir", 1, racuni.size());
		racuni.remove(index - 1);
	}
}