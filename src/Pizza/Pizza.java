package Pizza;

public class Pizza {
	private String[] toppings = new String[3];
	private double preis;
	private static int verkauftePizzen = 0;
	private PizzaStatus status;
	private PizzaSorte sorte;
	
	public enum PizzaStatus{
		BESTELLT, 
		IN_ZUBEREITUNG, 
		IN_LIEFERUNG,
		GELIEFERT
	}
	
	public enum PizzaSorte{
		SALAMI,
		MARGARITA,
		TUNA,
		PROSCIUTTO,
		QUATTRO_STAGIONI,
		QUATTRO_FORMAGGI
	}
	
	public Pizza(String[] toppings, double preis, 
			PizzaStatus status, PizzaSorte sorte){
		this.toppings = toppings;
		this.preis = preis;
		this.status = status;
		this.sorte = sorte;
		verkauftePizzen++;
	}
	
	public Pizza(double preis, PizzaStatus status) {
		this.preis = preis;
		this.status = status;
	}
	
	/* Rückgabewert
		Name
		Parameter
	*/
	public boolean wirdGeliefert() {
		if (this.getStatus() == PizzaStatus.IN_ZUBEREITUNG ||
				this.getStatus() == PizzaStatus.IN_LIEFERUNG) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public static int getVerkauftePizzen() {
		return verkauftePizzen;
	}

	public static void setVerkauftePizzen(int verkauftePizzen) {
		Pizza.verkauftePizzen = verkauftePizzen;
	}

	public PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(PizzaStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		String s = "Sorte: " + this.sorte + 
				"\nPreis: " + this.preis + 
				"\nStatus: " + this.status + 
				"\nToppings: ";
		
		
		for (String topping : toppings) {
			s += topping + ", ";
		}
		
		 /*
		for(int i = 0; i < toppings.length; i++) {
			s += toppings[i] + ", ";
		}
		*/
		return s;
	}

	public PizzaSorte getSorte() {
		return sorte;
	}

	public void setSorte(PizzaSorte sorte) {
		this.sorte = sorte;
	}
}
