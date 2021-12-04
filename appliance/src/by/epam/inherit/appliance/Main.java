package by.epam.inherit.appliance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Appliance a1 = new Appliance("tool", 5, 11);
		System.out.println(a1.info());

		Toaster t1 = new Toaster("toaster1", 4, 20, 800);
		Toaster t2 = new Toaster("toaster1", 4, 10, 800);
		Toaster t3 = new Toaster("toaster1", 2, 14, 800);
		Toaster t4 = new Toaster("toaster1", 4, 35, 800);
		System.out.println(t1.info());

		Television tv1 = new Television("TV1", 5, 500, 54);
		Television tv2 = new Television("TV2", 2, 300, 23);
		Television tv3 = new Television("TV3", 2, 150, 30);
		Television tv4 = new Television("TV4", 3, 1100, 43);
		Television tv5 = new Television("TV5", 3, 421, 27);
		Television tv6 = new Television("TV6", 3, 98, 29);
		System.out.println(tv1.info());

		Appliance iron1 = new Iron("iron1", 1, 60, "steam");
		Washer washer1= new Washer ("washer1", 2, 34, 7);
		CoffeeMachine coffee1= new CoffeeMachine("my precious", 3, 405, true);

		List<Appliance> stuff = new ArrayList<Appliance>();
		stuff.add(t1);
		stuff.add(t2);
		stuff.add(t3);
		stuff.add(t4);
		stuff.add(tv1);
		stuff.add(tv2);
		stuff.add(tv3);
		stuff.add(tv4);
		stuff.add(tv5);
		stuff.add(tv6);
		stuff.add(iron1);
		stuff.add(coffee1);
		stuff.add(washer1);
		
		for (int i = 0; i < stuff.size(); i++) {
			System.out.println(stuff.get(i).info());
		}

		System.out.println(stuff.contains(tv3));

		System.out.println(stuff.contains(new Iron("iron1", 1, 60, "steam")));

		List<Appliance> searchResult = new ArrayList<Appliance>();
		for (int i = 0; i < stuff.size(); i++) {
			if (stuff.get(i).getPrice() >= 10 && stuff.get(i).getPrice() <= 200) {
				searchResult.add(stuff.get(i));

			}
		}
		
		for (int i=0; i<searchResult.size();i++) {
			System.out.println(searchResult.get(i).info());
		}
		
		Goods iron2= new Iron("iron2", 1, 60, "steam");
		Book book1 = new Book ("Tom Sawyer","Mark Twain", 247);

		Basket basket= new Basket(iron2);
		basket.addToBasket(book1);
		
		System.out.println(basket.check());
		
	}

}
