package by.epam.inherit.appliance;

import java.util.Objects;

public class Book implements Goods{
	private String name;
	private String author;
	private int price;
	
	public Book (String name,String author, int price) {
		this.name=name;
		this.author=author;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String myName() {
		return name;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(author, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public int myPrice() {
	
		return price;
	}
	
	
	

}
