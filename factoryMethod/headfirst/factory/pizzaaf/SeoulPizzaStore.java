package headfirst.factory.pizzafm;

public class SeoulPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("Kimchi")) {
			return new SeoulStyleKimchiPizza();
		}else if (item.equals("cheese")) {
			return new SeoulStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new SeoulStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new SeoulStyleClamPizza();
		}
		else return null;
	}
}
