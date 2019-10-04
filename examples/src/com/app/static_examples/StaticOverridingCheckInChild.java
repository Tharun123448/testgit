package com.app.static_examples;

public class StaticOverridingCheckInChild extends StaticMethodInParent{
	
	public static void add(int i, int j) {
		System.out.println("Child add method");
	}
	public static void main(String[] args) {
		StaticOverridingCheckInChild childObject = new StaticOverridingCheckInChild();
		childObject.add(1, 2); // Print child class static method only, even a same static method in its parent class
		
		StaticMethodInParent parentWithChildCast = new StaticOverridingCheckInChild();
		parentWithChildCast.add(1, 2); //Prints Parent class Method
		
//		StaticOverridingCheckInChild ChildUpperCast = (StaticOverridingCheckInChild) new StaticMethodInParent();
//		ChildUpperCast.add(1, 2); //ClassCastException
	}
}
