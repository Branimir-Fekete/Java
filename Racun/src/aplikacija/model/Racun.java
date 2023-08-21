package aplikacija.model;

import java.util.Date;

public class Racun {

	private int id;
	private int PDV;
	private Date vrijemeIzdavanja;
	private String opisPlacanja;
	private int kupacId;
	private int uslugaId;
	private int proizvodId;

	public Racun() {
	}

	public Racun(int id, int PDV, Date vrijemeIzdavanja, String opisPlacanja, int kupacId, int uslugaId,
			int proizvodId) {
		this.id = id;
		this.PDV = PDV;
		this.vrijemeIzdavanja = vrijemeIzdavanja;
		this.opisPlacanja = opisPlacanja;
		this.kupacId = kupacId;
		this.uslugaId = uslugaId;
		this.proizvodId = proizvodId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPDV() {
		return PDV;
	}

	public void setPDV(int PDV) {
		this.PDV = PDV;
	}

	public Date getVrijemeIzdavanja() {
		return vrijemeIzdavanja;
	}

	public void setVrijemeIzdavanja(Date vrijemeIzdavanja) {
		this.vrijemeIzdavanja = vrijemeIzdavanja;
	}

	public String getOpisPlacanja() {
		return opisPlacanja;
	}

	public void setOpisPlacanja(String opisPlacanja) {
		this.opisPlacanja = opisPlacanja;
	}

	public int getKupacId() {
		return kupacId;
	}

	public void setKupacId(int kupacId) {
		this.kupacId = kupacId;
	}

	public int getUslugaId() {
		return uslugaId;
	}

	public void setUslugaId(int uslugaId) {
		this.uslugaId = uslugaId;
	}

	public int getProizvodId() {
		return proizvodId;
	}

	public void setProizvodId(int proizvodId) {
		this.proizvodId = proizvodId;
	}

}