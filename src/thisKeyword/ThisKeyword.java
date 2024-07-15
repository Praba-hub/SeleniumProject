package thisKeyword;

public class ThisKeyword {
	 
	int x,y;                    //instance or class variable
	void data(int x,int y){     //local or method variable
		this.x=x;               //this keyword used to reduce the memory if they have same variable name
		this.y=y;
	}
	void value(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		ThisKeyword res = new ThisKeyword();
		res.data(10, 20);
		res.value();
	}

}
