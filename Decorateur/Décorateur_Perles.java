package Decorateur;

import FabriqueMethode.Bijoux;

public class Décorateur_Perles  extends BijouxDécorateur {
	public Décorateur_Perles(Bijoux decoratedJewelry) {
		super(decoratedJewelry);
		}
	public String getType() {
		    return decoratedJewelry.getType();
		}

		public String getName() {
		    return decoratedJewelry.getName() + " with Pearls";
		}

		public String getDescription() {
		    return decoratedJewelry.getDescription() + " with added Pearls";
		}

		public double getPrice() {
		    return decoratedJewelry.getPrice() + 300.0; // pearl addition
		}

}
