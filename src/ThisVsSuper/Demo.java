package ThisVsSuper;


class A{                               //  extends Object default 
	public A() {                       // Default constructor
		System.out.println("in A");
	}
    public A(int b) {
    	
    	System.out.println("in A" + "   "+  b);
    }
}
class B extends A{
    public B() {						// Default constructor
    	   super(5);                          //here we have default super keyword  ---->  super();
    	System.out.println("in B");
	}
    public B(int a) {                       //super keyword execute the constructor of the parent class
    	this();                             //this keyword execute the constructor of the same class
    	System.out.println("in B" + "   "+  a);
    }
}


public class Demo {

	public static void main(String[] args) {
		
		B obj = new B(3);
	

	}

}
