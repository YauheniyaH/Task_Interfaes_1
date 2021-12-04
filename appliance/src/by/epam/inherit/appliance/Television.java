package by.epam.inherit.appliance;

import java.util.Objects;

public class Television extends Appliance {
	private int diagonal;
	
	public Television(String name, int lifespan, int price,int diagonal) {
		super(name, lifespan, price);
		this.diagonal=diagonal;
	}

	public int getDiagonal() {
		return diagonal;
	}
	
	public String info() {
		return getName()+" lifespan= "+getLifespan()+" power= "+getDiagonal()+" inch"+" price="+getPrice()+" $";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diagonal);
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
		Television other = (Television) obj;
		return diagonal == other.diagonal;
	}

}
