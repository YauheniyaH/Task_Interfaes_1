package by.epam.inherit.appliance;

import java.util.Objects;

public class Iron extends Appliance implements Goods{
	private String type;
	
	public Iron(String name, int lifespan, int price, String type) {
		super(name, lifespan, price);
		this.type=type;
	}

	public String getType() {
		return type;
	}
	
	public String info() {
		return getName()+" lifespan= "+getLifespan()+" power= "+getType()+" type"+" price="+getPrice()+" $";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(type);
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
		Iron other = (Iron) obj;
		return Objects.equals(type, other.type);
	}

	@Override
	public String myName() {
		
		return getName();
	}

	@Override
	public int myPrice() {
		
		return getPrice();
	}

}
