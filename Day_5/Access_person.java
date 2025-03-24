package Day_5;

public class Access_person {
public static void main(String[] args) {
	
	//og obj
	Person OGcons=new Person("Prathanhcan",20);
	//cp obj
	Person Copycons=new Person(OGcons);//object dependency
	System.out.println("Original person");
	OGcons.displayinfo();
	System.out.println("Copied  person");
	Copycons.displayinfo();
}
}
