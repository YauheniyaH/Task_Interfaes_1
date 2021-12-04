package by.epam.inherit.appliance;

import java.util.ArrayList;

import java.util.List;

public class Basket {
	private List<Goods> goods = new ArrayList<Goods>();
	
	public Basket (Goods good) {
		this.goods.add(good);
	}
	
	public void addToBasket( Goods good) {
		this.goods.add(good);
	}
	
	public int totalPrice() {
		int sum=0;
		for ( int i=0; i <goods.size();i++) {
			sum=sum+goods.get(i).myPrice();
		}
		
		return sum;
	}
	
	public String check() {
		String s="";
		for (int i=0; i<goods.size();i++) {
			s=s+" "+goods.get(i).myName()+" "+goods.get(i).myPrice();
		}
		s=s+" "+ totalPrice();
		return s;
	}

}
