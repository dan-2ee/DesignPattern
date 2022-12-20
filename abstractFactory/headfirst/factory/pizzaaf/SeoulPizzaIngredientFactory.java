package headfirst.factory.pizzaaf;

public class SeoulPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new RiceDough();
	}

	public Sauce createSauce() {
		return new ArrabbiataTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Kimchi(), new Arugula(),
							new BlackOlives(), 
							new Spinach(), };
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new WestSeaClams();
	}
}
