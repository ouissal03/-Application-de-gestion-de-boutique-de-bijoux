package FabriqueMethode;

import Composite.BijouxComposant;

public abstract class Bijoux implements BijouxComposant{
	private String type;
	private String name;
	private String description;
	private double price;
	
	public Bijoux(String type, String name, String description, double price) {
	    this.type = type;
	    this.name = name;
	    this.description = description;
	    this.price = price;
	}

	public String getType() {
	    return type;
	}

	public String getName() {
	    return name;
	}

	public String getDescription() {
	    return description;
	}

	public double getPrice() {
	    return price;
	}
}
