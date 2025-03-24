package Day_5;

public class overloadin_EG {
int c;
public  void add(int a, int b) {
	c=a+b; 
	System.out.println("The value of integer c: "+c);
}
public  void add(float a, int b) {
	float c=a+b;//local variable
	System.out.println("The value of float c: "+c);
	
}
public  void add(float a, double b) {
	double c=a+b;
	System.out.println("The value of double c: "+c);
	
}
public static void main(String[] args) {
	overloadin_EG ob7 =new overloadin_EG();
	ob7.add(5, 7);
	ob7.add(5.5f, 15);
	ob7.add(101, 50.7464);
}

}
