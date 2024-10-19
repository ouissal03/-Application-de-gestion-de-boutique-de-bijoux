package FabriqueAbstraite;

public class Fabrique_Argent implements Fabrique_Materiel_Bijoux {
		@Override
		public Materiel createMaterial() {
		return new Argent();
		}
		}

