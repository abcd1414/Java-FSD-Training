package SBA2;

public class Queston2 {
	public static void main(String[] args) {
		//concat
		String s="java";  
		 s=s.concat(" Program");  
		 System.out.println(s);  

		 System.out.println(" ");
		//equals
		 String s1="abc";  
		 String s2="abc";  
		 String s3=new String("pqr");  
		 String s4="xyz";  
		 System.out.println(s1.equals(s2));  
		 System.out.println(s1.equals(s3));
		 System.out.println(s1.equals(s4));

		 System.out.println(" ");
		//contains
		 String str = "hello world";
		      String str1 = "hello";
		      String str2 = "java";
		      System.out.println("hello is contains in the hello world so it is " + str.contains(str1));
		      System.out.println("java is not in the hello world so it is " + str.contains(str2));

		      System.out.println(" ");
		//replace
		      String str5 = "abcd";
		      String replace = str5.replace('b', 'x');
		      System.out.println(str5);
		      System.out.println("Replaced by "+ replace);
		     
		      System.out.println(" ");
		//Length
		      String s11="Good";  
		      String s22="Morning";  
		      System.out.println("string length is: "+s11.length());
		      System.out.println("string length is: "+s22.length());
		}  

}
