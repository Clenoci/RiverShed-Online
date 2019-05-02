

public class Menu extends FoodItem {
	
	
	public Menu() {
		FoodItem Hamburger = new FoodItem("Hamburger",11,"An 8 0z burger with lettuce tomato and pickles on the side","No Onion");
		FoodItem Cheeseburger = new FoodItem("Cheeseburger",11,"An 8 0z burger with your choice of cheese with lettuce tomato and pickles on the side","No Onion");
		FoodItem BaconCheeseburger = new FoodItem("Bacon Cheeseburger",11,"An 8 0z burger with bacon and your choice of cheese with lettuce tomato and pickles on the side","No Onion");
		System.out.println(Cheeseburger.getItemName()+ "\n" + Cheeseburger.getDescription());
	}
}
