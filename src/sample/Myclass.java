package sample;

public class Myclass {
	public static void main(String args[])
	{	System.out.println("=====constructor chaining in same class====");
		Parent obj=new Parent();//calling default constructor---process chaining
		System.out.println("=====constructor chaining between parent and child====");
		Child ch=new Child("name");//calling default constructor chaining in inheritance 
	}

}
