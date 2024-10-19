package Composite;

import java.util.ArrayList;
import java.util.List;

public class BijouxComposite implements BijouxComposant {
	
	private String name;
	private List<BijouxComposant> jewelryComponents;
	
	public BijouxComposite(String name) {
	    this.name = name;
	    this.jewelryComponents = new ArrayList<>();
	}

	public void add(BijouxComposant component) {
	    jewelryComponents.add(component);
	}

	public void remove(BijouxComposant component) {
	    jewelryComponents.remove(component);
	}

	public List<BijouxComposant> getComponents() {
	    return jewelryComponents;
	}

	public String getType() {
	    return "Composite";
	}

	public String getName() {
	    return name;
	}

	public String getDescription() {
	    return "Une combinaison de plusieurs bijoux";
	}

	public double getPrice() {
	    double totalPrice = 0.0;
	    for (BijouxComposant component : jewelryComponents) {
	        totalPrice += component.getPrice();
	    }
	    return totalPrice;
	}
}
