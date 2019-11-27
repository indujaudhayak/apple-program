package org.cts.test;

public class SingletonClass {
	static SingletonClass emp;

	 private SingletonClass() {
		
	}
	
	public  static SingletonClass add() {
		if(emp==null) {
			emp=new  SingletonClass();
			System.out.println(emp);
		}
		
		return emp;
		

	}
	public  static void empid() {
		System.out.println("emp id is 132335");

	}
	public void empname() {
	System.out.println("emp name is induja");
	

	}
	public static void main(String[] args) {
//		SingletonClass  s=	
				add();
//		s.empid();
//		s.empname();
	}
	
	}
	

