package Singleton;

import java.util.ArrayList;
import java.util.List;

import FabriqueMethode.Bijoux;

public class Bijouterie {
	
	private static Bijouterie instance;
	private List<Bijoux> jewelryList;
	
	 private Bijouterie() {
	    jewelryList = new ArrayList<>();
	}

	public static synchronized Bijouterie getInstance() {
	    if (instance == null) {
	        instance = new Bijouterie();
	    }
	    return instance;
	}

	public void addJewelry(Bijoux jewelry) {
	    jewelryList.add(jewelry);
	}

	public void removeJewelry(Bijoux jewelry) {
	    jewelryList.remove(jewelry);
	}

	public List<Bijoux> getJewelryList() {
	    return jewelryList;
}
}
