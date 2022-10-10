package sample;

public class sample {

	    public static void main(String[] args) {
	        example obj=new example();
	        example1 obj1=new example1();
	        obj.display();
	        obj1.display();
	    }
	}
	class example
	{
	    int a=100;
	    void display()
	    {
	        System.out.println("this is subdemo context");
	      
	    }
	}
class example1 extends example{
	protected void display()
	{
		System.out.println("The value of a is "+a);
	}
}
