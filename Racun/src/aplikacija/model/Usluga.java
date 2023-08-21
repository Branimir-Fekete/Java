package aplikacija.model;

public class Usluga {

	private int id;
	private String naziv;
	private float cijenaPoHa;
	private float kolicina;
	private String opis;

	public Usluga() {
	}

	public Usluga(int id, String naziv, float cijenaPoHa, float kolicina, String opis) {
		this.id = id;
		this.naziv = naziv;
		this.cijenaPoHa = cijenaPoHa;
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

	public float getCijenaPoHa() {
		return cijenaPoHa;
	}

	public void setCijenaPoHa(float cijenaPoHa) {
		this.cijenaPoHa = cijenaPoHa;
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