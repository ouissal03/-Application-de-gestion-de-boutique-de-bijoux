package FabriqueAbstraite;

import FabriqueMethode.Bijoux;
import FabriqueMethode.Collier;

public class Fabrique_Or_Collier  implements FabriqueAbstraiteBijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Collier(type, name, description, price);
	}
	@Override
	public Materiel createMaterial() {
	    return new Or();
	}

}
