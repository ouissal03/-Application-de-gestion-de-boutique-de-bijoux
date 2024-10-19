package Composite;

import java.util.List;

import FabriqueMethode.Bijoux;
import FabriqueMethode.Fabrique_Bijoux;

public interface BijouxComposant{
	void add(BijouxComposant component);
	void remove(BijouxComposant component);
	List<BijouxComposant> getComponents();
	String getType();
	String getName();
	String getDescription();
	double getPrice();
}
