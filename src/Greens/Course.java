package Greens;

 public class Course 
 {
	 public static void main(String[] args) {
		String S="Jesus";
		System.out.println("CharAt");
		char c=S.charAt(3);
		System.out.println(c);
		System.out.println("Length");
		int i=S.length();
		System.out.println(i);
		System.out.println("ToUpperCase");
		String s1=S.toUpperCase();
		System.out.println(s1);
		System.out.println("ToLowerCase");
		String s2=S.toLowerCase();
		System.out.println(s2);
		System.out.println("Equals");
		boolean s3=S.equals("jesus");
		System.out.println(s3);
		System.out.println("EqualsIgnoreCase");
		boolean s4=S.equalsIgnoreCase("jesus");
		System.out.println(s4);
		System.out.println("Starswitht");
		boolean s5=S.startsWith("J");
		System.out.println(s5);
		System.out.println("Endswith");
		boolean s6=S.endsWith("s");
		System.out.println(s6);
		System.out.println("Replace");
		String s7=S.replace("u", "a");
		System.out.println(s7);
		System.out.println("Trim");
		//String s8=S.trim();
		//System.out.println(s8);
		
		
	}
 }
