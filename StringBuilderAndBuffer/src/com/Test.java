package com;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Meher");
		System.out.println(sb.length());
		System.out.println(sb);
		
		sb.insert(5, " Krishna");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.replace(4, 7, "T");
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		
		System.out.println(sb.charAt(5));
		System.out.println(sb.deleteCharAt(9));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("prasanna");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuilder sb2 = new StringBuilder("Meher");
		System.out.println(sb2.capacity());
		
		
		StringBuffer stb = new StringBuffer();
		stb.append("Meher");
		stb.insert(5, "krishna");
		stb.replace(5, 9, "p");
		System.out.println(stb);
		stb.delete(5,9);
		System.out.println(stb);
		
		System.out.println(stb.capacity());
		
		StringBuffer stb1 = new StringBuffer("Meher Krishna");
		System.out.println(stb1);
		System.out.println(stb1.capacity() - stb1.length());
		System.out.println(stb1.capacity());
	}

}
