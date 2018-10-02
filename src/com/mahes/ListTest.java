package com.mahes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListTest {
	public static void main(String[] args) {
		Set<Integer> list = new HashSet<Integer>();
		list.add(new Integer(42));
		list.add(new Integer(42));
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().intValue());
		}
	}

}
