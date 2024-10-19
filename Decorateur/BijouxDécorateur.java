package Decorateur;

import FabriqueMethode.Bijoux;

public abstract class BijouxDécorateur extends Bijoux {

	protected Bijoux decoratedJewelry;
	
	public BijouxDécorateur(Bijoux decoratedJewelry) {
        super(decoratedJewelry.getType(), decoratedJewelry.getName(), decoratedJewelry.getDescription(), decoratedJewelry.getPrice());
        this.decoratedJewelry = decoratedJewelry;
    }
	
	public String getType() {
	    return decoratedJewelry.getType();
	}
	
	public String getName() {
	    return decoratedJewelry.getName();
	}
	
	public String getDescription() {
	    return decoratedJewelry.getDescription();
	}
	
	public double getPrice() {
	    return decoratedJewelry.getPrice();
	}
}
