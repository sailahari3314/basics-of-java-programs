package com.day1;
class D{
	void print() {
		System.out.println("default modifier");
	}
}
public class defaultex {
public static void main(String[] args) {
	
	A a=new A(); //public class object
	a.display(); //it is takes in public class. with same package
	
	//B b=new B();  //private class object
	//b.display1();  //it takes in private class. so it shows error. private access only in same class
	
	
	C c=new C();   //protected class object 
	c.show(); //it takes in protected class within and outside of package
	
	D d=new D(); //it is default class object
	d.print();   //it takes in default class within package
	
	
	
}
}
