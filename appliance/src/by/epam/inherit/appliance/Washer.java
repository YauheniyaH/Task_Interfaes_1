package by.epam.inherit.appliance;

import java.util.Objects;

public class Washer extends Appliance{
	
	private int capacity;
	
	public Washer (String name, int lifespan, int price, int capacity) {
		super(name, lifespan, price);
		this.capacity=capacity;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public String info() {
		return getName()+" lifespan= "+getLifespan()+" power= "+getCapacity()+" kg"+" price="+ getPrice()+" $";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity);
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
		Washer other = (Washer) obj;
		return capacity == other.capacity;
	}
	
	
}
