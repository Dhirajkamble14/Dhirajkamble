package string;

public class Methods_String {

	public static void main(String[] args) {
		
		
         String name = "Datatype";
         
         //is empty- boolean
         System.out.println(name.isEmpty());
         
         //length starts with 1, index starts with 0
         
         String value = "Automation Testing";
         
         System.out.println(value.length());
         
         System.out.println(value.replace("Automation", "Manual"));
         
         System.out.println(value.indexOf("T"));
         
         System.out.println(value.indexOf("t"));
         System.out.println("index of A " + value.indexOf("A"));
         System.out.println("index of g " + value.indexOf("g") );
         
         System.out.println(value.charAt(14));
         
         System.out.println(value.toLowerCase());
         
         System.out.println(value.toUpperCase());
         
         String k = "Software Testing Platform";
         System.out.println(k.replace("Soft", "Hard"));
         System.out.println(k.replace("Software Testing Platform", "solution to problem"));
         
         
	}
}
