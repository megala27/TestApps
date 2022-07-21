package com.module3;

public class StringTest {

	public static void main(String[] args) {
		String str = "Text";
		System.out.println(str.hashCode());
		String str1 = "Text";
		String add = str.concat("Venkat");
		
		
		System.out.println("***************" + add.hashCode());
		System.out.println(str1.hashCode());
		
		
		String string = new String("Hellow");
		System.out.println(string.hashCode());
		String string1 = new String("Hellow");
		System.out.println(string1.hashCode());
		
		
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		
		System.out.println(string == string1);
		System.out.println(string.equals(string1));
	}

}
