package com.app.static_examples;

public class StaticInInterfaceImpl implements StaticInInterface {

	@Override
	public void concerateMethod() {
		System.out.println("Concreate method of Interface");
	}
	public static void staticMethod() {
		System.out.println("in Static method of impl class");
	}
	public static void main(String[] args) {
		StaticInInterfaceImpl siii = new StaticInInterfaceImpl();
		siii.staticMethod();
		StaticInInterface.staticMethodInInteface(); //static method scope will be till that interface and not even in its implemented class.
	}
}
