package method_sign;

public class Signature {
	
	String h = "STP";
	
	public void function(String v, int b, float p, int i) {
		//parameter type, parameter = argument
		System.out.println("4 args");
	}
	
	public void function(String v, int b, float p) {
	    //parameter type, parameter = argument
		System.out.println("3 args");
	}
	
	public void verify(int b) {
		System.out.println("1 args");
		
	}
	
	public void verify(String h, int b) {
		System.out.println("2 args");
		
	}
	
	//method signature is a name of the method followed by parameter type

	public static void main(String[] args) {
		
	     Signature sign = new Signature();
		
		sign.function("abc", 20, 90.70f);
		
		sign.function("xyz",1, 1.1f, 10);

	}
}
