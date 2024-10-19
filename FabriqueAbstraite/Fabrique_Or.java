package FabriqueAbstraite;

public class Fabrique_Or implements Fabrique_Materiel_Bijoux {
		 @Override
		 public Materiel createMaterial() {
		 return new Or();
		 }
}
