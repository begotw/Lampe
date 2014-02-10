/**
 * Classe de la lampe
 * @author begotw
 */
public class maLampe {

	/**
	 * Classe n°1
	 * @param args
	 */

		// Définition des variables
		/** Puissance de la lampe. */
		private int puissance;
		/** Etat de la lampe. */
		private boolean estAllumee;
		/** Définition de la puissance de la lampe par défaut. */
		public static final int PUISSANCE_DEFAUT = 100;
		/** Définition de l'état de la lampe par défaut. */
		public static final boolean ESTALLUMEE_DEFAUT = false;
		
		
		
		// Constructeurs
		/** 
		 * Constructeur par défaut.
		 */
		public maLampe () {
			this.puissance = maLampe.PUISSANCE_DEFAUT;
			this.estAllumee = maLampe.ESTALLUMEE_DEFAUT;
		}
		/**
		 * Constructeur avec une puissance définie pour la lampe.
		 * @param puissanceInitiale
		 */
		public maLampe (int puissanceInitiale) {
			this.puissance = puissanceInitiale;
			this.estAllumee = ESTALLUMEE_DEFAUT;
		}
		
		
		
		// Accesseurs
		
	

}
