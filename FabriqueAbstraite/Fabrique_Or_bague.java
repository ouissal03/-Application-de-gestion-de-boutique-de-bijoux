package FabriqueAbstraite;

import FabriqueMethode.Bijoux;
import FabriqueMethode.Bague;

public class Fabrique_Or_bague  implements FabriqueAbstraiteBijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Bague(type, name, description, price);
	}
	@Override
	public Materiel createMaterial() {
	    return new Or();
	}

}
