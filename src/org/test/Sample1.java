package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sample1 {
public static void main(String[] args) {
	Map<Integer, String> m = new HashMap();
	m.put(10, "maven");
	m.put(10, "sql");
	m.put(20, "selenium");
	m.put(30, "maven");
	m.put(40, "selenium");
	System.out.println(m);
	Map<Integer, String> m1 = new LinkedHashMap();
	m1.put(40, "maven");
	m1.put(30, "java");
	m1.put(20, "sql");
	m1.put(10, "selenium");
	System.out.println(m1);
	Map<Integer, String> m2 = new TreeMap();
	m2.put(40, "maven");
	m2.put(30, "java");
	m2.put(20, "sql");
	m2.put(10, "selenium");
	System.out.println(m2);
	Set<Integer> keySet = m2.keySet();
	System.out.println(keySet);
	Collection<String> values = m2.values();
System.out.println(values);
Set<Entry<Integer,String>> entrySet = m2.entrySet();
System.out.println(entrySet);
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry);
	
}
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry.getValue());
	
}
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry.getKey());
	
}
}
}

