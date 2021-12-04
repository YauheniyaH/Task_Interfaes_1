package by.epam.inherit.appliance;

import java.util.Objects;

public class Appliance {
	
	private String name;
	private int lifespan;
	private int price;
	
	
	public  Appliance() {
		this.name =null;
		this.lifespan=0;
		this.price=0;
		
	}
	
	public  Appliance(String name, int lifespan, int price) {
		this.name =name;
		this.lifespan=lifespan;
		this.price=price;
		
	}
	
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public int getLifespan() {
		return lifespan;
	}

	public String info() {
		return getName()+" lifespan= "+ getLifespan()+" year(s) "+" price="+" price="+getPrice()+" $";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lifespan, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return lifespan == other.lifespan && Objects.equals(name, other.name) && price == other.price;
	}
	
	
 

}
