package org.innerclass;

public class Anonymous {
	public static void main(String[] args) {
		PopCorn p = new PopCorn(){
			public void pop(){
				System.out.println("Anonymous PopCorn");
			}
			public void sizzle(){
				System.out.println("Anonymous Sizzle");
			}
		};
		p.pop();
		p.sizzle();
	}

}

class PopCorn{
	public void pop(){
		System.out.println("Popcorn");
	}
	public void sizzle(){
		System.out.println("Sizzle");
	}
}