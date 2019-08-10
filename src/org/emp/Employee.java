package org.emp;

public class Employee {
	public void empId(int a) {
		System.out.println(a);
	}
	public void empId(int a,int b) {
		System.out.println(a+b);
	}
	public void empId(int a,float b) {
		System.out.println(a+b);
	}
	public void empId( float a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(5);
		e.empId(5,8);
		e.empId(3.6f,6);
		e.empId(5,5.8f);
	}
		
	}


