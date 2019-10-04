package com.app.java8features.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForeachClass implements Consumer<String> {
	 
	List<String> empList = new ArrayList<String>();
	 public  List<String> addEmployes(){
		 empList.add("emp1");
		 empList.add("emp2");
		 empList.add("emp3");
		 empList.add("emp4");
		 empList.add("emp5");
		 empList.add("emp6");
		 empList.add("emp7");
		 empList.add("emp8");
		 return empList;
	 }
	 
	 public static void main(String[] args) {
		ForeachClass fc = new ForeachClass();
		List<String> listEmp = fc.addEmployes();
		listEmp.forEach(fc); //here using consumer object for iterating using "forEach"
	}
	@Override
	public void accept(String t) {
		System.out.println("employee "+t);
	}
}
