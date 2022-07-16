package com.cg.inheritance;
//Program on Hierarchical inheritance
class Electronics{

	void displayname() {
		System.out.println("This is Electronics product");
	}
}

class Laptop extends Electronics{
	
	void display() {
		System.out.println("2:HP 15s");
	}
}
class Speaker extends Electronics{
	
	void display() {
		System.out.println("1:Boat portable speaker");
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Speaker s=new Speaker();
		s.display();
		s.displayname();
		
		Laptop l= new Laptop();
		l.display();
		l.displayname();
				
	}

}
