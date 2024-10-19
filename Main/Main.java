package Main;
import Composite.BijouxComposant;
import Composite.BijouxComposite;
import Decorateur.Décorateur_Diamants;
import Decorateur.Décorateur_Perles;
import FabriqueAbstraite.Fabrique_Or_BouclesDOreilles;
import FabriqueAbstraite.FabriqueAbstraiteBijoux;
import FabriqueAbstraite.Materiel;
import FabriqueAbstraite.Fabrique_Argent_Collier;
import FabriqueMethode.Bijoux;
import Singleton.Bijouterie;
import Stratégie.BlackFridayRemise;
import Stratégie.ChristmasRemise;
import Stratégie.StratégieDeRemise;

public class Main {
	public static void main(String[] args) {
		// Singleton  -  instance Bijouterie
		Bijouterie jewelryStore = Bijouterie.getInstance();   // Factory Pattern - Earring creation using GoldEarringFactory
		    FabriqueAbstraiteBijoux goldEarringFactory = new Fabrique_Or_BouclesDOreilles();
		    Bijoux goldEarring = goldEarringFactory.createJewelry("Boucle D'oreille", "Boucle d'oreille en or", "Belle boucle d'oreille en or", 1000.0);

		    // Fabrique - Création de collier avec SilverNecklaceFactory
		    FabriqueAbstraiteBijoux silverNecklaceFactory = new Fabrique_Argent_Collier();
		    Bijoux silverNecklace = silverNecklaceFactory.createJewelry("Collier", "Collier en argent", "Collier en argent élégant", 2000.0);

		    // Fabrique abstraite - Création matérielle pour boucle d'oreille en or et collier en argent
		    Materiel goldMaterial = goldEarringFactory.createMaterial();
		    Materiel silverMaterial = silverNecklaceFactory.createMaterial();

		    // Decorateur - Décorations en diamant et perle pour boucle d'oreille en or et collier en argent
		    Bijoux diamondGoldEarring = new Décorateur_Diamants(goldEarring);
		    Bijoux pearlSilverNecklace = new Décorateur_Perles(silverNecklace);

		    // Composite  - Combinaison de GoldEarring et PearlSilverNecklace
		    BijouxComposant jewelryComposite = new BijouxComposite("Collier composé");
		    jewelryComposite.add(goldEarring);
		    jewelryComposite.add(pearlSilverNecklace);

		    // Strategie - BlackFridayDiscount et ChristmasDiscount appliqués aux bijoux
		    StratégieDeRemise blackFridayDiscount = new BlackFridayRemise();
		    StratégieDeRemise christmasDiscount = new ChristmasRemise();

		    double discountedGoldEarringPrice = blackFridayDiscount.applyDiscount(goldEarring.getPrice());
		    double discountedSilverNecklacePrice = christmasDiscount.applyDiscount(silverNecklace.getPrice());
		    double discountedJewelryCompositePrice = blackFridayDiscount.applyDiscount(jewelryComposite.getPrice());
			// Output
			System.out.println("Boucle d'oreille en or: " + goldEarring.getName() + " - " + goldEarring.getDescription() + " - " + goldMaterial.getType() + " - " + goldEarring.getPrice() + " - " + discountedGoldEarringPrice);
			System.out.println("Collier en argent: " + silverNecklace.getName() + " - " + silverNecklace.getDescription() + " - " + silverMaterial.getType() + " - " + silverNecklace.getPrice() + " - " + discountedSilverNecklacePrice);
			System.out.println("Boucle d'oreille en or diamant: " + diamondGoldEarring.getName() + " - " + diamondGoldEarring.getDescription() + " - " + goldMaterial.getType() + " - " + diamondGoldEarring.getPrice());
			System.out.println("Collier Argent Perle: " + pearlSilverNecklace.getName() + " - " + pearlSilverNecklace.getDescription() + " - " + silverMaterial.getType() + " - " + pearlSilverNecklace.getPrice());
			System.out.println("Collier composé: " + jewelryComposite.getName() + " - " + jewelryComposite.getDescription() + " - " + jewelryComposite.getPrice() + " - " + discountedJewelryCompositePrice);
		

	}
}
