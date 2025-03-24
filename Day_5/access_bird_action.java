package Day_5;

public class access_bird_action extends Bird implements Flyable {

	
	public void fly() {
	
		System.out.println("Bird Flys");
	}
public static void main(String[] args) {
	access_bird_action ob66=new access_bird_action();
	ob66.fly();
	ob66.eat();
	
}
}
