package Decorateur;

import FabriqueMethode.Bijoux;

public class Décorateur_Diamants  extends BijouxDécorateur {
	public Décorateur_Diamants(Bijoux decoratedJewelry) {
		super(decoratedJewelry);
		}
	public String getType() {
		    return decoratedJewelry.getType();
		}
	public String getName() {
	    return decoratedJewelry.getName() + " with Diamonds";
	}

	public String getDescription() {
	    return decoratedJewelry.getDescription() + " with added Diamonds";
	}

	public double getPrice() {
	    return decoratedJewelry.getPrice() + 500.0; // diamond addition
	}
}
