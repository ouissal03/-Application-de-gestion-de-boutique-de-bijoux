package FabriqueAbstraite;

import FabriqueMethode.Boucle_Doreille;
import FabriqueMethode.Bijoux;

public class Fabrique_Argent_BouclesDoreilles implements FabriqueAbstraiteBijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Boucle_Doreille(type, name, description, price);
	}
	@Override
	public Materiel createMaterial() {
	    return new Argent();
	}

}
