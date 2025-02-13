package cartes;

public class Borne extends Cartes{
	
	private int km;

	public Borne(int km) {
		this.km = km;
	}
	
	public int getKm() {
		return this.km;
	}
	
	public String toString() {
		return ("Borne " + km);
	}
}
