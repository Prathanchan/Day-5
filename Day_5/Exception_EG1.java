package Day_5;

public class Exception_EG1 {
String str1="5567";
public void name() {
	try {
		int i=Integer.parseInt(str1);
		System.out.println("The value of coverted string:"+str1);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Exception_EG1 ee=new Exception_EG1();
	ee.name();
}
}
