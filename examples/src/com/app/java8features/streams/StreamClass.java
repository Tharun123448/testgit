package com.app.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamClass {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<=100;i++)
			list.add(i);
		Stream<Integer> sequentialStream = list.stream();
		Stream<Integer> parallelStream = list.parallelStream();
		
		//sequentialStream.anyMatch(p->p==33);
		
		parallelStream.filter(p -> p>90).forEach(p->System.out.println("parallel filtering : "+p));
		sequentialStream.filter(p -> p>90).forEach(p -> System.out.println("sequential filtering : "+p));
		//sequentialStream.allMatch(p -> p==33); // Exception - java.lang.IllegalStateException: stream has already been operated upon or closed
		
		//Supplier<Stream<Integer>> supplierStream = () -> (sequentialStream);
		//supplierStream.get().anyMatch(p->p==33);
	}

}
