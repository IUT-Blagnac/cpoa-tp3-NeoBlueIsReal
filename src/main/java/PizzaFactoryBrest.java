

public class PizzaFactoryBrest extends PizzaFactory {
	private static PizzaFactoryBrest instance = null;

    private PizzaFactoryBrest() {

    }

    public synchronized static PizzaFactoryBrest getInstance() {
        if (instance == null) {
            instance = new PizzaFactoryBrest();
        }
        return instance;
    }
    public Pizza creerPizza(String type) {

        Pizza pizza;
        switch (type) {
            case "fromage":
                pizza = new PizzaFromageStyleBrest();
                break;
            case "grecque":
                pizza = new PizzaGrecqueStyleBrest();
                break;
            default:
                pizza = new PizzaPoivronStyleBrest();
                break;
        }
        return pizza;
    }
}
