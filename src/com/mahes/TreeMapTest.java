package com.mahes;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("a", "apple");
		treeMap.put("b", "ball");
		treeMap.put("c", "Cat");
		SortedMap<String, String> subMap;
		subMap = treeMap.subMap("d", "e");
		System.out.println(treeMap + "   " +subMap);
		treeMap.put("d", "dog");
		subMap.put("e", "elephant");
		System.out.println(treeMap+ "  " +subMap);
	}

}
