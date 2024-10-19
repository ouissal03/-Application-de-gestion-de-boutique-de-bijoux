package Stratégie;

public class BlackFridayRemise extends StratégieDeRemise {
		 @Override
		 public double applyDiscount(double price) {
		 return price * 0.9; // 10% discount on Black Friday
		 }
}
