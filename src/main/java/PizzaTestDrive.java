public class PizzaTestDrive {
	public static void main(String[] args) {
		System.out.println("hello world");
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creerPizzeria("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creerPizzeria("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandÃ© une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandÃ© une " + pizza.getNom() + "\n");
    }
}