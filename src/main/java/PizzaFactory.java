

public abstract class PizzaFactory {
	public Pizza creerPizza(String type) {
        Pizza pizza;
        switch (type){
            case "fromage":
                pizza = new PizzaFromageStyleBrest() ;
            case "grecque":
                pizza = new PizzaGrecqueStyleBrest() ;
            default:
                pizza = new PizzaPoivronStyleBrest() ;
        }

        return pizza ;
    }
}
