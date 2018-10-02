package com.mahes;

public class Test {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 5, 6, 7 };
		int start = array[0];
		int j=0;
		for (int i = 0; i < array.length; i++) {
			if (array[j] == start) {
				int fromElement = start;
				System.out.println("Start element is " + fromElement);
			} else if (array[i-1] != array[i]) {
				start = array[i];
				System.out.println("Start is "+start);
				int toElement = array[i];
				System.out.println("To Element is " + toElement);
			}
			j = j+1;
		}
	}

}