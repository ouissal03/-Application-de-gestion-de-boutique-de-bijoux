package FabriqueAbstraite;

import FabriqueMethode.Bijoux;

public interface FabriqueAbstraiteBijoux {
	Bijoux createJewelry(String type, String name, String description, double price);
	Materiel createMaterial();
}
