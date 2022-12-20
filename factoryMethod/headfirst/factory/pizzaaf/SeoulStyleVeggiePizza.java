package headfirst.factory.pizzafm;

public class SeoulStyleVeggiePizza extends Pizza {
	public SeoulStyleVeggiePizza() {
		name = "Seoul Veggie Pizza";
		dough = "Thick Crust Dough";
		sauce = "Arrabbiata Tomato Sauce";
 
		toppings.add("Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("arugula");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
