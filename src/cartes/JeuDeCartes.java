package cartes;

import java.util.ArrayList;
import java.util.List;

public class JeuDeCartes {
	private List<Carte> liste_carte = new ArrayList<>();
	
//	public Jeu
	
	
	
	public String affichageJeuCartes() {
		Configuration[] jeuDeCartes = jeu();
		StringBuilder string = new StringBuilder();
		
		for(int i = 0; i < jeuDeCartes.length; i++) {
			string.append(jeuDeCartes[i].getNbExemplaires() + " " + jeuDeCartes[i].getCarte().toString() + "\n");
		}
		return string.toString();
	}
	
	
	public Carte[] donnerCartes() {
		Configuration[] jeuDeCartes = jeu();
		
		int totalCartes = 0;
		
		for(int i = 0; i < jeuDeCartes.length; i++) {
			totalCartes = totalCartes + jeuDeCartes[i].getNbExemplaires();
		}
		
		Carte[] tableau = new Carte[totalCartes];
		
		int it = 0;
		
		for(int i = 0; i < jeuDeCartes.length; i++) {
			for(int j = 0 ; j < jeuDeCartes[i].getNbExemplaires(); j++) {
				tableau[it] = jeuDeCartes[i].getCarte();
				it++;
			}
		}
		
		System.out.println(totalCartes);
		return tableau;
	}
	
	public boolean checkCount() {
		Carte[] jeu = donnerCartes();
		Carte carte;
		
		//Cartes
		Carte borne25 = new Borne(25);
		Carte borne50 = new Borne(50);
		Carte borne75 = new Borne(75);
		Carte borne100 = new Borne(100);
		Carte borne200 = new Borne(200);
		
		Carte paradeFeu = new Parade(Type.FEU);
		Carte paradeEssence = new Parade(Type.ESSENCE);
		Carte paradeCrevaison = new Parade(Type.CREVAISON);
		Carte paradeAccident = new Parade(Type.ACCIDENT);
		Carte finLimite = new FinLimite();
		
		Carte debutLimite = new DebutLimite();
		Carte attaqueFeu = new Attaque(Type.FEU);
		Carte attaqueEssence = new Attaque(Type.ESSENCE);
		Carte attaqueCrevaison = new Attaque(Type.CREVAISON);
		Carte attaqueAccident = new Attaque(Type.ACCIDENT);
		
		Carte botteFeu = new Botte(Type.FEU);
		Carte botteEssence = new Botte(Type.ESSENCE);
		Carte botteCrevaison = new Botte(Type.CREVAISON);
		Carte botteAccident = new Botte(Type.ACCIDENT);
		
		
		//Initialisation
		int nb_borne_25 = 0;
		int nb_borne_50 = 0;
		int nb_borne_75 = 0;
		int nb_borne_100 = 0;
		int nb_borne_200 = 0;
		
		int nbParadeFeu = 0;
		int nbParadeEssence = 0;
		int nbParadeCrevaison = 0;
		int nbParadeAccident = 0;
		int nbFinLimite = 0;
		
		int nbDebutLimite = 0;
		int nbAttaqueFeu = 0;
		int nbAttaqueEssence = 0;
		int nbAttaqueCrevaison = 0;
		int nbAttaqueAccident = 0;
		
		int nbBotteFeu = 0;
		int nbBotteEssence = 0;
		int nbBotteCrevaison = 0;
		int nbBotteAccident = 0;
		
		
		for(int i = 0; i < jeu.length; i++) {
			if (jeu[i].equals(borne25)){
				nb_borne_25++;
			} else if (jeu[i].equals(borne50)){
				nb_borne_50++;
			} else if (jeu[i].equals(borne75)){
				nb_borne_75++;
			} else if (jeu[i].equals(borne100)){
				nb_borne_100++;
			} else if (jeu[i].equals(borne200)){
				nb_borne_200++;
			} else if (jeu[i].equals(paradeFeu)){
				nbParadeFeu++;
			} else if (jeu[i].equals(paradeEssence)){
				nbParadeEssence++;
			} else if (jeu[i].equals(paradeCrevaison)){
				nbParadeCrevaison++;
			} else if (jeu[i].equals(paradeAccident)){
				nbParadeAccident++;
			} else if (jeu[i].equals(finLimite)){
				nbFinLimite++;
			} else if (jeu[i].equals(debutLimite)){
				nbDebutLimite++;
			} else if (jeu[i].equals(attaqueFeu)){
				nbAttaqueFeu++;
			} else if (jeu[i].equals(attaqueEssence)){
				nbAttaqueEssence++;
			} else if (jeu[i].equals(attaqueCrevaison)){
				nbAttaqueCrevaison++;
			} else if (jeu[i].equals(attaqueAccident)){
				nbAttaqueAccident++;
			} else if (jeu[i].equals(botteFeu)){
				nbBotteFeu++;
			} else if (jeu[i].equals(botteEssence)){
				nbBotteEssence++;
			} else if (jeu[i].equals(botteCrevaison)){
				nbBotteCrevaison++;
			} else if (jeu[i].equals(botteAccident)){
				nbBotteAccident++;
			}
		}
			
			
			
			//Resultat
			if (nb_borne_25 != 10) {
				return false;
			} else if (nb_borne_50 != 10) {
				return false;
			} else if (nb_borne_75 != 10) {
				return false;
			} else if (nb_borne_100 != 12) {
				return false;
			} else if (nb_borne_200 != 4) {
				return false;
			} else if (nbParadeFeu != 14) {
				return false;
			} else if (nbParadeEssence != 6) {
				return false;
			} else if (nbParadeAccident != 6) {
				return false;
			} else if (nbParadeCrevaison != 6) {
				return false;
			} else if (nbFinLimite != 6) {
				return false;
			} else if (nbDebutLimite != 4) {
				return false;
			} else if (nbAttaqueFeu != 5) {
				return false;
			} else if (nbAttaqueEssence != 3) {
				return false;
			} else if (nbAttaqueAccident != 3) {
				return false;
			} else if (nbAttaqueCrevaison != 3) {
				return false;
			} else if (nbBotteCrevaison != 1) {
				return false;
			} else if (nbBotteCrevaison != 1) {
				return false;
			} else if (nbBotteCrevaison != 1) {
				return false;
			} else if (nbBotteCrevaison != 1) {
				return false;
			}
			
			
			return true;
		
	}
	
	public Configuration[] jeu() {
		Configuration[] jeu = new Configuration[19];
		jeu[0] = new Configuration(new Borne(25), 10);
		jeu[1] = new Configuration(new Borne(50), 10);
		jeu[2] = new Configuration(new Borne(75), 10);
		jeu[3] = new Configuration(new Borne(100), 12);
		jeu[4] = new Configuration(new Borne(200), 4);
		
		jeu[5] = new Configuration(new FinLimite(), 6);
		jeu[6] = new Configuration(new Parade(Type.FEU), 14);
		jeu[7] = new Configuration(new Parade(Type.ESSENCE), 6);
		jeu[8] = new Configuration(new Parade(Type.CREVAISON), 6);
		jeu[9] = new Configuration(new Parade(Type.ACCIDENT), 6);
		
		jeu[10] = new Configuration(new DebutLimite(), 4);
		jeu[11] = new Configuration(new Attaque(Type.FEU), 5);
		jeu[12] = new Configuration(new Attaque(Type.ESSENCE), 3);
		jeu[13] = new Configuration(new Attaque(Type.CREVAISON), 3);
		jeu[14] = new Configuration(new Attaque(Type.ACCIDENT), 3);
		
		jeu[15] = new Configuration(new Botte(Type.FEU), 1);
		jeu[16] = new Configuration(new Botte(Type.ESSENCE), 1);
		jeu[17] = new Configuration(new Botte(Type.CREVAISON), 1);
		jeu[18] = new Configuration(new Botte(Type.ACCIDENT), 1);
		
		return jeu;
	}
	
	private class Configuration{
		private int nbExemplaires;
		private Carte carte;
		
		private Configuration(Carte carte, int nbExemplaires) {
			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
	}
}
