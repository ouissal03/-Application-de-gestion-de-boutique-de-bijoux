package FabriqueMethode;

public class Fabrique_Boucle_Doreille implements Fabrique_Bijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Boucle_Doreille(type, name, description, price);
	}
}