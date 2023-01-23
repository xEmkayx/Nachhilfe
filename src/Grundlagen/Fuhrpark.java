package Grundlagen;

public class Fuhrpark {
	private int anz_stellplaetze;
	private Fahrzeug[] fahrzeuge;
	
	public Fuhrpark(int anz_stellplaetze, 
			Fahrzeug[] fahrzeuge) {
		this.anz_stellplaetze = anz_stellplaetze;
		this.fahrzeuge = fahrzeuge;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Fahrzeug fahrzeug : fahrzeuge) {
			sb.append("Name: " + fahrzeug.getName() + "\n");
			sb.append("Preis: " + fahrzeug.getPreis() + "\n");
			sb.append("Max Speed: " + fahrzeug.getMax_geschw() 
				+ "\n");
		}
		
		sb.append("Freie Plätze: "+ freiePlaetze(Fahrzeug.getAnz_fahrzeuge()) + "/" + anz_stellplaetze);
		
		return sb.toString();
	}
	
	private int freiePlaetze(int anzFahrzeuge) {
		int antwort = this.anz_stellplaetze - anzFahrzeuge;
		return antwort;
	}

	public int getAnz_stellplaetze() {
		return anz_stellplaetze;
	}

	public void setAnz_stellplaetze(int anz_stellplaetze) {
		this.anz_stellplaetze = anz_stellplaetze;
	}

	public Fahrzeug[] getFahrzeuge() {
		return fahrzeuge;
	}

	public void setFahrzeuge(Fahrzeug[] fahrzeuge) {
		this.fahrzeuge = fahrzeuge;
	}
	
	
}
