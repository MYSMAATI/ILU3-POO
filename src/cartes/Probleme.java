package cartes;

public abstract class Probleme extends Carte {
	private Type type;
	
	protected Probleme(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return this.type;
	}
	
	@Override
	public boolean equals(Object e) {
		if(super.equals(e)) {
			if(e instanceof Carte) {
				Carte carte = (Carte) e;
				return type.equals(((Probleme) carte).getType());
			}
		}
		return false;
	}
}
