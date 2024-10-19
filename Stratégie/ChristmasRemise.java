package Stratégie;

public class ChristmasRemise  extends StratégieDeRemise {
	@Override
	public double applyDiscount(double price) {
	    return price * 0.8; // 20% discount on Christmas
	}
}
