package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
	}
	
	public String toString() {
		return "Attaque " + getType().toString(); 
	}
}
