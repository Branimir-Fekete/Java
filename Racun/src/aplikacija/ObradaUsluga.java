package aplikacija;

import java.util.ArrayList;
import java.util.List;

import aplikacija.model.Usluga;

public class ObradaUsluga {

	private List<Usluga> usluge;

	public List<Usluga> getUsluge() {
		return usluge;
	}

	public ObradaUsluga() {
		usluge = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		usluge.add(new Usluga(1, "Usluga oranja", 70, 100, "Oranje plugom okretačem s 5 brazdi"));
		usluge.add(new Usluga(2, "Usluga pripreme za sjetvu", 50, 75, "Priprema sjetvospremačem"));
	}

	public void prikaziIzbornik() {
		System.out.println("Usluga izbornik");
		System.out.println("1. Pregled postojećih usluga");
		System.out.println("2. Unos nove usluge");
		System.out.println("3. Promjena postojeće usluge");
		System.out.println("4. Brisanje postojeće usluge");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku usluga izbornika: ", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledUsluga();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeUsluge();
			prikaziIzbornik();
			break;
		case 3:
			promjenaUsluge();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeUsluge();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}

	public void pregledUsluga() {
		System.out.println("-------------------");
		System.out.println("---- Usluge ----");
		System.out.println("-------------------");
		int b = 1;
		for (Usluga u : usluge) {
			System.out.println(b++ + ". " + u.getNaziv());
		}
		System.out.println("-------------------");
	}

	private void dodavanjeUsluge() {
		Usluga u = new Usluga();
		u.setId(Pomocno.unosRasponBroja("Unesi ID usluge: ", "Pozitivan broj", 1, Integer.MAX_VALUE));
		u.setNaziv(Pomocno.unosString("Unesi naziv usluge: ", "Naziv obavezan"));
		u.setCijenaPoHa(Pomocno.unosFloat("Unesi cijenu usluge po hektaru: ", "Greška kod unosa"));
		u.setKolicina(Pomocno.unosFloat("Unesi količinu usluge: ", "Greška kod unosa"));
		u.setOpis(Pomocno.unosString("Unesi opis usluge: ", "Opis obavezan"));
		usluge.add(u);
	}

	private void promjenaUsluge() {
		pregledUsluga();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj usluge: ", "Nije dobar odabir", 1, usluge.size());
		Usluga u = usluge.get(index - 1);
		u.setId(Pomocno.unosRasponBroja("Unesi ID usluge (" + u.getId() + "): ", "Pozitivan broj", 1,
				Integer.MAX_VALUE));
		u.setNaziv(Pomocno.unosString("Unesi naziv usluge (" + u.getNaziv() + "): ", "Naziv obavezan"));
		u.setCijenaPoHa(
				Pomocno.unosFloat("Unesi cijenu usluge po hektaru (" + u.getCijenaPoHa() + "): ", "Greška kod unosa"));
		u.setKolicina(Pomocno.unosFloat("Unesi količinu usluge (" + u.getKolicina() + "): ", "Greška kod unosa"));
		u.setOpis(Pomocno.unosString("Unesi opis usluge (" + u.getOpis() + "): ", "Opis obavezan"));
	}

	private void brisanjeUsluge() {
		pregledUsluga();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj usluge: ", "Nije dobar odabir", 1, usluge.size());
		usluge.remove(index - 1);
	}
}
