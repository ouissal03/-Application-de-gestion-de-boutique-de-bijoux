package FabriqueMethode;

public interface Fabrique_Bijoux {
	Bijoux createJewelry(String type, String name, String description, double price);
}
