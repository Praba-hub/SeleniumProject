package SuperKeyword;


public class Animal {
		String color="white";
		
		void work(){
		System.out.println("eating...");
       	}
}
class Dog extends Animal{
	String color="black";
	void color(){
		System.out.println(super.color);
	   	}
//	void work(){
//	System.out.println("barking...");
//   	}

	void work(){
	      super.work();
	   	}


}
