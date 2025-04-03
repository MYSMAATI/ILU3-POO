package cartes;

public class Borne extends Carte{
	
	private int km;

	public Borne(int km) {
		this.km = km;
	}
	
	public int getKm() {
		return this.km;
	}
	
	public String toString() {
		return ("Borne " + km + "KM");
	}
	
	@Override
	public boolean equals(Object e) {
		if(super.equals(e)) {
			if(e instanceof Carte) {
				Carte carte = (Carte) e;
				return km == (((Borne) carte).getKm());
			}
		}
		return false;
	}
}
