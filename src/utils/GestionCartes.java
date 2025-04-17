package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import cartes.Carte;

public class GestionCartes <E extends Carte> {
	public static <E> E extraireList(E[] cartes)  {
		int taille_cartes = cartes.length;	
		int i = (int) Math.random() * taille_cartes;
		
		E carte = cartes[i];
		cartes[i] = null;
		
		return carte;
	}
	
	public static <E> E extraireListIterator(List<E> cartes) {
			int taille_cartes = cartes.size();	
			int i = (int) Math.random() * taille_cartes;
			ListIterator<E> iterateur = cartes.listIterator(i);
			
			E carte = iterateur.next();
			iterateur.remove();
		
			return carte;
		}
	
	
	
	public static <E> List<E> melanger(List<E> cartes) {
		List<E> sortie = new ArrayList<>();
		
		for(int i = 0; i < cartes.size(); i ++) {
			sortie.add(extraireListIterator(cartes));
		} 
		
		return sortie;	
	}
	
	public static <E> boolean verifierMelange(List<E> liste1, List<E> liste2) {
		ListIterator<E> iterateur1 = liste1.listIterator();
		ListIterator<E> iterateur2 = liste2.listIterator();
		
		while(iterateur1.hasNext()) {
			if(Collections.frequency(liste1, iterateur1.next()) != Collections.frequency(liste2, iterateur2.next())) {
				return false;
			}
		}
		
		return true;
	}
	
	public static <E> List<E> rassembler(List<E> cartes){
		return cartes;
	}
}