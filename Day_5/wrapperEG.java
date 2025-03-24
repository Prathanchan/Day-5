package Day_5;
//auto boxing
public class wrapperEG {
public static void main(String[] args) {
	//converting Primitive to wrapper class
	int a = Integer.valueOf(50);
	Integer intob=50;//Equivalent to Integer.valueof(50);
	Character charob  = 'A';
	Double dob=7623.894927;
	System.out.println(a);
	System.out.println(intob);
	System.out.println(charob);
	System.out.println(dob);
System.out.println("________________________________________");
	//Converting wrapper class to primitive
   int value1= intob;
   char value2= charob;
   double value3= dob;
   System.out.println(value1);
   System.out.println(value2);
   System.out.println(value3);
   System.out.println("________________________________________");
//Using utility method from wrapper class
   int parseInt=Integer.parseInt("1213342321");
   double parseDoubleb =Double.parseDouble("25.466489691364464");
   boolean parseBoolean = Boolean.parseBoolean("True");
   System.out.println(parseInt);
   System.out.println(parseDoubleb);
   System.out.println(parseBoolean);
			
}
}
