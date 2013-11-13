package model;

public class Persoon {
	
	private String naam;
	private String voornaam;
	
	public Persoon(String vnaam, String naam){
		setVoornaam(vnaam);
		setNaam(naam);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

}
