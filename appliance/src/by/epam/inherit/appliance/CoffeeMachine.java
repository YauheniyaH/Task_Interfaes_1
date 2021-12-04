package by.epam.inherit.appliance;

public class CoffeeMachine extends Appliance {
	
	private boolean hasCapuchino;
	
	public CoffeeMachine(String name, int lifespan, int price, boolean hasCapuchino) {
		super(name, lifespan, price);
		this.hasCapuchino=hasCapuchino;
	}

	public boolean isHasCapuchino() {
		return hasCapuchino;
	}

	public String info() {
		return getName()+" lifespan= "+getLifespan()+" Capuchino= "+isHasCapuchino()+" price="+ getPrice()+" $";
	}
}
