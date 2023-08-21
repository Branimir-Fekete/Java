package aplikacija.model;

public class Kupac {

	private int id;
	private String nazivSubjekta;
	private String adresa;
	private String OIB;
	private String IBAN;

	public Kupac() {
	}

	public Kupac(int id, String nazivSubjekta, String adresa, String OIB, String IBAN) {
		this.id = id;
		this.nazivSubjekta = nazivSubjekta;
		this.adresa = adresa;
		this.OIB = OIB;
		this.IBAN = IBAN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazivSubjekta() {
		return nazivSubjekta;
	}

	public void setNazivSubjekta(String nazivSubjekta) {
		this.nazivSubjekta = nazivSubjekta;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getOIB() {
		return OIB;
	}

	public void setOIB(String OIB) {
		this.OIB = OIB;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}

}