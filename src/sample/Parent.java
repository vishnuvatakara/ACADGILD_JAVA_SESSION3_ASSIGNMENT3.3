package sample;
//parent class
public class Parent {

	Parent() //parent class default constructor
	{
		this(5);//calling constructor chaining
		//System.out.println("the default constructor");

	}
	Parent(int x) //parent class paremetraised constructor
	{	
		this("string");
		System.out.println("calling parent class int paremetraisd constructor "+x);
	}
	Parent(String s) //parent class paremetraised constructor
	{
		System.out.println("calling parent class string paremetraisd constructor "+s);
	}
	
}
