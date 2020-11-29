import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String pasta;
	protected String sauce;
	protected ArrayList<String> garnitures;
	
	public Pizza() {
		this.garnitures = new ArrayList<String>();
	}
	
	public void preparer() {
		
	}
	
	public void cuire() {
		
	}
	
	public void couper() {
		
	}
	
	public void emballer() {
		
	}
	
	public String getNom() {
		return this.name;
	}
}
