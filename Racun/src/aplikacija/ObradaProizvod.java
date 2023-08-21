package aplikacija;

import java.util.ArrayList;
import java.util.List;

import aplikacija.model.Proizvod;

public class ObradaProizvod {

	private List<Proizvod> proizvodi;

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public ObradaProizvod() {
		proizvodi = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		proizvodi.add(new Proizvod(1, "Pšenica", 100, 200, "Pšenica iz konvencionalne proizvodnje"));
	    proizvodi.add(new Proizvod(2, "Suncokret", 200, 125, "Suncokret iz konvencionalne proizvodnje"));
	    proizvodi.add(new Proizvod(3, "Kukuruz", 400, 120, "Kukuruz iz konvencionalne proizvodnje"));
	}

	public void prikaziIzbornik() {
		System.out.println("Proizvod izbornik");
		System.out.println("1. Pregled postojećih proizvoda");
		System.out.println("2. Unos novog proizvoda");
		System.out.println("3. Promjena postojećeg proizvoda");
		System.out.println("4. Brisanje postojećeg proizvoda");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku proizvod izbornika: ", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledProizvoda();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeProizvoda();
			prikaziIzbornik();
			break;
		case 3:
			promjenaProizvoda();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeProizvoda();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}

	public void pregledProizvoda() {
		System.out.println("-------------------");
		System.out.println("---- Proizvodi ----");
		System.out.println("-------------------");
		int b = 1;
		for (Proizvod p : proizvodi) {
			System.out.println(b++ + ". " + p.getNaziv());
		}
		System.out.println("-------------------");
	}

	private void dodavanjeProizvoda() {
		Proizvod p = new Proizvod();
		p.setId(Pomocno.unosRasponBroja("Unesi ID proizvoda: ", "Pozitivan broj", 1, Integer.MAX_VALUE));
		p.setNaziv(Pomocno.unosString("Unesi naziv proizvoda: ", "Naziv obavezan"));
		p.setCijena(Pomocno.unosFloat("Unesi cijenu proizvoda: ", "Greška kod unosa"));
		p.setKolicina(Pomocno.unosFloat("Unesi količinu proizvoda: ", "Greška kod unosa"));
		p.setOpis(Pomocno.unosString("Unesi opis proizvoda: ", "Opis obavezan"));
		proizvodi.add(p);
	}

	private void promjenaProizvoda() {
		pregledProizvoda();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj proizvoda: ", "Nije dobar odabir", 1, proizvodi.size());
		Proizvod p = proizvodi.get(index - 1);
		p.setId(Pomocno.unosRasponBroja("Unesi ID proizvoda (" + p.getId() + "): ", "Pozitivan broj", 1,
				Integer.MAX_VALUE));
		p.setNaziv(Pomocno.unosString("Unesi naziv proizvoda (" + p.getNaziv() + "): ", "Naziv obavezan"));
		p.setCijena(Pomocno.unosFloat("Unesi cijenu proizvoda (" + p.getCijena() + "): ", "Greška kod unosa"));
		p.setKolicina(Pomocno.unosFloat("Unesi količinu proizvoda (" + p.getKolicina() + "): ", "Greška kod unosa"));
		p.setOpis(Pomocno.unosString("Unesi opis proizvoda (" + p.getOpis() + "): ", "Opis obavezan"));
	}

	private void brisanjeProizvoda() {
		pregledProizvoda();
		int index = Pomocno.unosRasponBroja("Odaberi redni broj proizvoda: ", "Nije dobar odabir", 1, proizvodi.size());
		proizvodi.remove(index - 1);
	}
}
