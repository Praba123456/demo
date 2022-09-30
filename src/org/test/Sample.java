package org.test;

public class Sample {
	public static void main(String[] args) {
String s = "Java";
String s1= "Java";
int hashCode = System.identityHashCode(s);
System.out.println("hashcode:" +hashCode);
int hashCode2 = System.identityHashCode(s1);
	System.out.println("hashcode2:" +hashCode2);
	System.out.println("============");
	String s2 =new String("Selenium");
	String s3= new String("Selenium");
	int hashCode3 = System.identityHashCode(s2);
	System.out.println("hashcode3:" +hashCode3);
	int hashCode4 = System.identityHashCode(s3);
		System.out.println("hashcode4:" +hashCode4);
		System.out.println("============");
		String s4 = "Praba";
		String s5 = "Praba";
		int hashCode5 = System.identityHashCode(s4);
	System.out.println("hashcode5:" +hashCode5);
	int hashCode6 = System.identityHashCode(s5);
	System.out.println("hashcode6:" +hashCode6);
	String concat = s4.concat(s5);
	System.out.println("concat:" +concat);
	int hashCode7 = System.identityHashCode(concat);
	System.out.println("hashcode7:" +hashCode7);
	StringBuffer s6 =new StringBuffer("sql");
	StringBuffer s7 =new StringBuffer("sql");
	int hashCode8 = System.identityHashCode(s6);
	System.out.println("hashcode8:" +hashCode8);
	int hashCode9 = System.identityHashCode(s7);
	System.out.println("hashcode9:" +hashCode9);
	StringBuffer append = s6.append(s7);
	System.out.println("append:" +append);
	int hashCode10 = System.identityHashCode(append);
	System.out.println("hashcode10:"+hashCode10);
	StringBuilder s8 = new StringBuilder("maven");
	StringBuilder s9 = new StringBuilder("api");
	int hashCode11 = System.identityHashCode(s8);
	System.out.println(hashCode11);
	int hashCode12 = System.identityHashCode(s9);
	System.out.println(hashCode12);
	StringBuilder append2 = s8.append(s9);
	System.out.println(append2);
	int hashCode13 = System.identityHashCode(append2);
	System.out.println(hashCode13);
	
	
	
	}

}
