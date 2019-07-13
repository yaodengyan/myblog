package ydy;

public class test {
	public static void main(String[] args) {
		int a=12;
		int b=12;
		System.out.println(a==b);
		
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str1));
		
		
		String st1 = "123";
		String st2 = "123";
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
	}
}
