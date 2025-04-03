package cartes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sabot <E extends Carte> implements Iterator<E>{
	private int nbCartes;
	private E[] tableau;
	private int indiceIterateur = 0;
	private boolean nextEffectue = false;
	
	
	public Sabot(E[] tab){
		this.tableau = tab;
		nbCartes = tableau.length;
	}
	
	public boolean hasNext() {
		return indiceIterateur < nbCartes;
	}
	
	public E next() {
		if(hasNext()) {
			E carte = tableau[indiceIterateur];
			indiceIterateur++;
			nextEffectue = true;
			return carte;
		} else {
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public void remove() {
		if(nbCartes < 1 || !nextEffectue) {
			throw new IllegalStateException();
		}
		
		for(int i = indiceIterateur - 1; i < nbCartes; i++) {
			tableau[i] = tableau[i + 1];
		}
		
		nextEffectue = false;
		indiceIterateur--;
		nbCartes--;
	}
	
	public boolean estVide() {
		return(nbCartes != 0);
	}
	
	public void ajouterCarte(E carte) {
		try {
			tableau[nbCartes] = carte;
			nbCartes++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sabot déjà plein \n");
		}
	}
	
	public E piocher() {
		E carte = next();
		remove();
		return carte;
	}
	
}
