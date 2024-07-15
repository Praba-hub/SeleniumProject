package Methods;

public class MethodName {

	public void getData() {
	System.out.println("i am in method");
	}
	
	
	public static void main(String[] args) {
		MethodName m = new MethodName();
        m.getData();
        String s = "Welcome";
    	String a = s.substring(2, 4);
    	System.out.println(a);
	}

}
