package Day_5;

public class Access_food_menu implements vegitms,non_veg {

	
	public void fry() {
		System.out.println("Non veg");
		System.out.println("Chicken fry,fish fry,mutton roast");
	}

	
	public void gravy() {
		System.out.println("Mutton Gravy,Chicken Gravy,Fish Gravy");
		
	}

	
	public void breakFast() {
	System.out.println("veg");
		System.out.println("Sandwich,Dosa,idly");
	}

	
	public void lunch() {
		System.out.println("Meals,sambar sadham");
		
	}
	public static void main(String[] args) {
		Access_food_menu ob4=new Access_food_menu();
		ob4.fry();
		ob4.gravy();
		ob4.breakFast();
		ob4.lunch();
	}

}
