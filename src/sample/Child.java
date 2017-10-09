package sample;
//child class
public class Child extends Parent 
{
	Child()	//child class default constructor
	{
		System.out.println("child default constructor");
		
	}
	Child(String name)	//child class paremetraised constructor
	{	super(name);//calling parent class specified constructor other than default calling
		System.out.println("paremetraised constructor of child");
	}
	

}
