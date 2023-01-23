package Grundlagen;

public class Fahrzeug {
	private int max_geschw;
	private int ps;
	private String farbe;
	private String name;
	private double preis;
	private static int anz_fahrzeuge = 0;
	
	public Fahrzeug(int max_geschw, int ps, String farbe, 
			String name, double preis) {
		
		this.max_geschw = max_geschw;
		this.ps = ps;
		this.farbe = farbe;
		this.name = name;
		this.preis = preis;
		anz_fahrzeuge++;
	}

	public int getMax_geschw() {
		return max_geschw;
	}

	public void setMax_geschw(int max_geschw) {
		this.max_geschw = max_geschw;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public static int getAnz_fahrzeuge() {
		return anz_fahrzeuge;
	}

	public static void setAnz_fahrzeuge(int anz_fahrzeuge) {
		Fahrzeug.anz_fahrzeuge = anz_fahrzeuge;
	}
	
}
