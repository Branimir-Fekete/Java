package aplikacija.model;

public class Proizvod {

	private int id;
	private String naziv;
	private float cijena;
	private float kolicina;
	private String opis;

	public Proizvod() {
	}

	public Proizvod(int id, String naziv, float cijena, float kolicina, String opis) {
		this.id = id;
		this.naziv = naziv;
		this.cijena = cijena;
		this.kolicina = kolicina;
		this.opis = opis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public float getCijena() {
		return cijena;
	}

	public void setCijena(float cijena) {
		this.cijena = cijena;
	}

	public float getKolicina() {
		return kolicina;
	}

	public void setKolicina(float kolicina) {
		this.kolicina = kolicina;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
