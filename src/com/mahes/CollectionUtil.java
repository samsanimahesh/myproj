package com.mahes;

import java.util.List;

public class CollectionUtil {
	
	final List<Integer> integerList;
	public CollectionUtil(List<Integer> intList){
		this.integerList = intList;
	}
	
	public List<Integer> getList(){
		return integerList;
	}

	public void addElementToList(int i) {
		integerList.add(i);
	}

}
