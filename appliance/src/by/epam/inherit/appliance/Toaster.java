package by.epam.inherit.appliance;

import java.util.Objects;

public class Toaster extends Appliance{
	private int power;
	
	public Toaster (String name, int lifespan, int price, int power) {
		super(name, lifespan, price );
		this.power=power;
	}
	
	
	public int getPower() {
		return power;
	}


	public String info() {
		return getName()+" lifespan= "+getLifespan()+" power= "+getPower()+" watt"+" price="+ getPrice()+" $";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(power);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toaster other = (Toaster) obj;
		return power == other.power;
	}

}
