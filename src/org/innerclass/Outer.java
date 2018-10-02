package org.innerclass;

public class Outer {
	
	private String x="outer";
	
	void doStuff(final int ii){
		final String x = "inner";
		class MyInner{
			void seeOuter(){
				System.out.println("Inner is " +x);
				System.out.println("Outer is " +Outer.this.x);
				System.out.println("Method variable is " +ii);
			}
		}
		MyInner i = new MyInner();
		i.seeOuter();
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.doStuff(5);
	}
}
