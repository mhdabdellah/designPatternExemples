package pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
            
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza(PizzaType.MAURIT);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		//System.out.println(pizza);
 
//		pizza = store.orderPizza(PizzaType.VEGGIE);
//		System.out.println("We ordered a " + pizza.getName() + "\n");
		//System.out.println(pizza);
	}
}
