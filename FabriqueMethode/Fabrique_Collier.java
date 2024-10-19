package FabriqueMethode;

public class Fabrique_Collier implements Fabrique_Bijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Collier(type, name, description, price);
	}
	}