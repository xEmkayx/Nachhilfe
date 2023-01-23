package Pizza;

import Pizza.Pizza.PizzaStatus;

public class Starter {
	public static void main(String[] args) {
		String[] toppings = {"Tomatensauce", "Salami", "Käse"};
		Pizza p1 = new Pizza(toppings, 2.0, Pizza.PizzaStatus.BESTELLT,
				Pizza.PizzaSorte.SALAMI);
		
		System.out.println(p1.toString());
	}

}