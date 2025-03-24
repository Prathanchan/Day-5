package Day_5;

public class Calculator {

	//By changing the number of argunents
	public int add(int a,int b) {
		int c = a + b;
		System.out.println(c);
		return c;
		
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
public static void main(String[] args) {
	Calculator ob5=new Calculator();
	ob5.add(10, 100);
	System.out.println(ob5.add(10, 100,50));
}

}
