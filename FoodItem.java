
public class FoodItem {
	String itemName,modifier,description;
	int price;
	
	public FoodItem(){
		itemName=null;
		price=0;
		description = "THIS IS ABSOLUTELY NOTHING";
		modifier=null;
	}
	
	public FoodItem(String item,int priceOfItem,String itemDescription, String modifierOnItem){
		itemName = item;
		price = priceOfItem;
		description = itemDescription;
		modifier = modifierOnItem;
		
		
	}
	
	public String getItemName(){
		return this.itemName;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public String getModifiers(){
		return this.modifier;
	}
	

}
