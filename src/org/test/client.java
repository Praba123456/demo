package org.test;

import java.util.Iterator;
import java.util.List;

public class client {
public static void main(String[] args) {
	int a[]=new int[4];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	int length = a.length;
	System.out.println("length:" +length);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	for (int x : a) {
		System.out.println(x);
	}

}
}
