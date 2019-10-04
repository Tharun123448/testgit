package com.app.static_examples;

public class BlockVsStaticMethod {
	{
		System.out.println("block1");
	}
	static { // first preference for static block
		System.out.println("static block");
	}
	{
		System.out.println("block");
	}
	void method() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		BlockVsStaticMethod b = new BlockVsStaticMethod();
		b.method();
	}

}
