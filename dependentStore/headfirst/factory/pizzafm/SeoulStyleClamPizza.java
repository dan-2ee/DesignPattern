package headfirst.factory.pizzafm;

public class SeoulStyleClamPizza extends Pizza {
	public SeoulStyleClamPizza() {
		name = "Seoul Style Clam Pizza";
		dough = "Thick Crust Dough";
		sauce = "Arrabbiata Tomato Sauce";
 
		toppings.add("Mozzarella Cheese");
		toppings.add("West Sea Clams from Chesapeake Bay");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
