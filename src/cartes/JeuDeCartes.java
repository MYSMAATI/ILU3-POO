package cartes;

public class JeuDeCartes {
	public JeuDeCartes() {
		
	}
	
	public String affichageJeuDeCartes() {
		Configuration[] jeuDeCartes = jeu();
		StringBuilder string = new StringBuilder();
		
		string.append("JEU : \n");
		
		for(int i = 0; i < jeuDeCartes.length; i++) {
			string.append(jeuDeCartes[i].getNbExemplaires() + " " + jeuDeCartes[i].getCarte().getString() + "\n");
		}
		
		
		return string.toString();
	}
	
	//public Cartes[] donnerCartes() {
		//Cartes[] tabCartes = new Cartes[19]; 
		
	//}
	
	public Configuration[] jeu() {
		Configuration[] jeu = new Configuration[19];
		jeu[0] = new Configuration(new Borne(25), 10);
		jeu[1] = new Configuration(new Borne(50), 10);
		jeu[2] = new Configuration(new Borne(75), 10);
		jeu[3] = new Configuration(new Borne(100), 12);
		jeu[4] = new Configuration(new Borne(200), 4);
		jeu[5] = new Configuration(new Parade(Type.FEU), 14);
		jeu[6] = new Configuration(new FinLimite(), 6);
		jeu[7] = new Configuration(new Parade(Type.ESSENCE), 6);
		jeu[8] = new Configuration(new Parade(Type.CREVAISON), 6);
		jeu[9] = new Configuration(new Parade(Type.ACCIDENT), 6);
		jeu[10] = new Configuration(new Attaque(Type.FEU), 5);
		jeu[11] = new Configuration(new DebutLimite(), 4);
		jeu[12] = new Configuration(new Attaque(Type.ESSENCE), 3);
		jeu[13] = new Configuration(new Attaque(Type.CREVAISON), 3);
		jeu[14] = new Configuration(new Attaque(Type.ACCIDENT), 3);
		jeu[15] = new Configuration(new Botte(Type.FEU), 1);
		jeu[16] = new Configuration(new Botte(Type.ESSENCE), 1);
		jeu[17] = new Configuration(new Botte(Type.CREVAISON), 1);
		jeu[18] = new Configuration(new Botte(Type.ACCIDENT), 1);
		
		return jeu;
	}
	
	private class Configuration extends Cartes{
		private int nbExemplaires;
		private Cartes carte;
		
		private Configuration(Cartes carte, int nbExemplaires) {
			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}
		
		public Cartes getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
	}
}
