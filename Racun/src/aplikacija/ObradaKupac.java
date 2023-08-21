package aplikacija;

import java.util.ArrayList;
import java.util.List;

import aplikacija.model.Kupac;

public class ObradaKupac {

	private List<Kupac> kupci;

	public List<Kupac> getKupci() {
		return kupci;
	}

	public ObradaKupac() {
		kupci = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		kupci.add(new Kupac(1, "Otkup d.o.o.", "Kralja Tomislava 11, Tomislav grad", "71788811640",
				"HR5623600003555122791"));
		kupci.add(new Kupac(2, "Prekup d.d.", "Kralaj Zvonimira 22, Osijek", "48738466613", "HR4125000094359835333"));
		kupci.add(new Kupac(3, "Dokup j.d.o.", "Kralja Petra Krešimira 33, Vukovar", "25494313864",
				"HR7223600003316151945"));
	}

	public void prikaziIzbornik() {
		System.out.println("Kupac izbornik");
		System.out.println("1. Pregled postojećih kupaca");
		System.out.println("2. Unos novog kupca");
		System.out.println("3. Promjena postojećeg kupca");
		System.out.println("4. Brisanje postojećeg kupca");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku kupac izbornika: ", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledKupaca();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeKupca();
			prikaziIzbornik();
			break;
		case 3:
			promjenaKupca();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeKupca();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}

	public void pregledKupaca() {
		System.out.println("-------------------");
		System.out.println("---- Kupci ----");
		System.out.println("-------------------");
		int b = 1;
		for (Kupac k : kupci) {
			System.out.println(b++ + ". ID: " + k.getId() + ", Naziv: " + k.getNazivSubjekta());
		}
		System.out.println("-------------------");
	}

	private void dodavanjeKupca() {
		Kupac k = new Kupac();
		k.setId(Pomocno.unosRasponBroja("Unesi ID kupca: ", "Pozitivan broj", 1, Integer.MAX_VALUE));
		k.setNazivSubjekta(Pomocno.unosString("Unesi naziv subjekta: ", "Naziv obavezan"));
		k.setAdresa(Pomocno.unosString("Unesi adresu kupca: ", "Adresa obavezna"));
		k.setOIB(Pomocno.unosString("Unesi OIB kupca: ", "OIB obavezan"));
		k.setIBAN(Pomocno.unosString("Unesi IBAN kupca: ", "IBAN obavezan"));
		kupci.add(k);
	}

	private void promjenaKupca() {
		pregledKupaca();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj kupca: ", "Nije dobar odabir", 1, kupci.size());
		Kupac k = kupci.get(index - 1);
		k.setId(Pomocno.unosRasponBroja("Unesi ID kupca (" + k.getId() + "): ", "Pozitivan broj", 1,
				Integer.MAX_VALUE));
		k.setNazivSubjekta(
				Pomocno.unosString("Unesi naziv subjekta (" + k.getNazivSubjekta() + "): ", "Naziv obavezan"));
		k.setAdresa(Pomocno.unosString("Unesi adresu kupca (" + k.getAdresa() + "): ", "Adresa obavezna"));
		k.setOIB(Pomocno.unosString("Unesi OIB kupca (" + k.getOIB() + "): ", "OIB obavezan"));
		k.setIBAN(Pomocno.unosString("Unesi IBAN kupca (" + k.getIBAN() + "): ", "IBAN obavezan"));
	}

	private void brisanjeKupca() {
		pregledKupaca();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj kupca: ", "Nije dobar odabir", 1, kupci.size());
		kupci.remove(index - 1);
	}
}
