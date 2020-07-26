package com.epam.JavaStreamLambdas;

import java.util.ArrayList;
import java.util.List;

public class Avgintegers {
	public static double getintegersAverage() {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(5);
		integerList.add(10);
		integerList.add(50);
		return integerList.stream().mapToInt(e -> e).average().orElse(0);
	}
}