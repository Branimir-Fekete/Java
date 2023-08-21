package aplikacija;

public class Administrator {

	private int id;
	private String ime;
	private String prezime;
	private String email;
	private String lozinka;
	private String OIB;

	public Administrator() {
	}

	public Administrator(int id, String ime, String prezime, String email, String lozinka, String OIB) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.lozinka = lozinka;
		this.OIB = OIB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getOIB() {
		return OIB;
	}

	public void setOIB(String OIB) {
		this.OIB = OIB;
	}

}