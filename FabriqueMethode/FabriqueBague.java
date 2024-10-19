package FabriqueMethode;

public class FabriqueBague implements Fabrique_Bijoux {
	@Override
	public Bijoux createJewelry(String type, String name, String description, double price) {
	return new Bague(type, name, description, price);
	}
}