package jeu;


import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot <E extends Carte> implements Iterable<E>{

	private E[] cartes;
	private int nbCartes = 0;
	private int nbOperations = 0;
	
	public Sabot(E[] cartes) {
		this.cartes = cartes;
		this.nbCartes = cartes.length;
	}
	
	public boolean estVide() {
		return(nbCartes == 0);
	}
	
	public E piocher() {
		Iterator<E> iterateur = this.iterator();
		if(!iterateur.hasNext()) {
			throw new NoSuchElementException();
		}
		
		E carte = iterateur.next();
		iterateur.remove();	
		return carte;
	}
	
	public Iterator<E> iterator(){
		return new Iterateur();
	}
	
	private class Iterateur implements Iterator<E>{
		private int indiceIterateur = 0;
		private boolean nextEffectue = false;
		private int nbOperatationsReference = nbOperations;
		
		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}
		
		public E next() {
			if(hasNext()) {
				E carte = cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				nbOperatationsReference++;
				nbOperations++;
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
			
			for(int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i + 1];
			}
			
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
			
			nbOperatationsReference++;
			nbOperations++;
		}
		
		private void verificationConcurence() {
			if(nbOperations != nbOperatationsReference) {
				throw new ConcurrentModificationException();
			}
		}
		
	}
	
}
