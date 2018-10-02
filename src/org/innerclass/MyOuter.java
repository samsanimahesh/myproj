package org.innerclass;

public class MyOuter {
	
	public static final Integer i = 5;
	
	public static void doStuff(){
		final String s ="outer";
		class MyInner{
			public void seeOuter(){
				System.out.println("Outer value is "+i);
				System.out.println("Method variable is "+s);
			}
		}
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
	public static void main(String[] args) {
		MyOuter.doStuff();
		
	}

}
