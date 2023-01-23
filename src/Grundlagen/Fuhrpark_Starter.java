package Grundlagen;

public class Fuhrpark_Starter {
	public static void main(String[] args) {
		/*
		 private int anz_stellplaetze;
			private Fahrzeug[] fahrzeuge;
		 */
		
		Fahrzeug ferrari = new Fahrzeug(400, 280, "rot", 
				"Ferrari", 199999.99);
		Fahrzeug uboot = new Fahrzeug(20, 18000, "GELB", 
				"Yellow Submarine", 10000000.00);
		Fahrzeug flugzeug = new Fahrzeug(850, 25000, "weiß",
				"Daniel Düsentrieb", 20000000.00);
		
		Fahrzeug[] wellisGefaehrte = {ferrari, uboot, flugzeug};
				
		Fuhrpark wellstein = new Fuhrpark(20000, wellisGefaehrte);
		
		// System.out.println(wellstein.toString());
		
		System.out.println(wellstein.toString());
	}
}
