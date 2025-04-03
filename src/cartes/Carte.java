package cartes;

public abstract class Carte { 
	
	
	@Override
	public boolean equals(Object e) {
		if(e instanceof Carte) {
			Carte carte = (Carte) e;
			return getClass().equals((carte).getClass());
		}	
		return false;
	}
}
