package headfirst.factory.pizzafm;

public class SeoulStyleCheesePizza extends Pizza {

	public SeoulStyleCheesePizza() { 
		name = "Seoul Style spicy Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Arrabbiata Tomato Sauce";
 
		toppings.add("Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
