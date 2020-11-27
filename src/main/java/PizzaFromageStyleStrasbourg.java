public class PizzaFromageStyleStrasbourg extends Pizza {
	
	public PizzaFromageStyleStrasbourg() {
        super();
        this.name="Pizza pâte style Strasbourg et fromage";
        this.garnitures.add("Mozzarella en lamelles");
    }
    @Override
    public void preparer() {
        System.out.println("Préparation de"+this.getNom());
        System.out.println("Étalage de la pâte...");
        System.out.println("Ajout de la sauce...");
        System.out.println("Ajout des garnitures:");
        System.out.println(" "+this.garnitures.get(0));
        
    }

    @Override
    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    @Override
    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
}
