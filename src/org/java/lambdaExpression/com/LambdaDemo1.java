package org.java.lambdaExpression.com;

import java.util.function.Function;

public class LambdaDemo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f = (Integer number)->{
			return number*number;
		};
		
		Function<Integer, Integer> f1 = (number)->{
			return number*number;
		};
		Function<Integer, Integer> f2 = (number)-> number*number;
		
		Function<Integer, Integer> f3 = number-> number*number;
		
		System.out.println(f.apply(6)+"\t"+f1.apply(5)+"\t"+f2.apply(6)+"\t"+f3.apply(8));

	}

}
