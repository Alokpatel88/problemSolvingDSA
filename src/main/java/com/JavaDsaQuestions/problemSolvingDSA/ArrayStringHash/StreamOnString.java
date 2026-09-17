package com.JavaDsaQuestions.problemSolvingDSA.ArrayStringHash;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOnString {
	private void countWithSuffix(ArrayList<String> strArr) {
		// TODO Auto-generated method stub
		ArrayList<String> resStrArr = new ArrayList<>();
		for(int i = 0; i< strArr.size(); i++) {
			if(strArr.get(i).toLowerCase().charAt(0) == 'a') {
				resStrArr.add(strArr.get(i));
			}
		}
		System.out.println("Original strArray" + strArr.toString());
		System.out.println("resStrArr is = " + resStrArr);
		
		// with Streams
		ArrayList<String> streamResArr = new ArrayList<>();
//		names.stream()
//	    .filter(name -> name.startsWith("A"))
//	    .count();
		ArrayList<String> resultStreamStrArr = strArr.stream().filter(str -> (str.startsWith("A") || str.startsWith("a") ))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("resultStreamStrArr - " + resultStreamStrArr);
	}
	
	public static void main(String []args) {
		StreamOnString objOnString = new StreamOnString();
//		ArrayList<StringBuffer> strArr = new ArrayList<>();
//		strArr.add(new StringBuffer("Alok"));
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Harsh");
		strArr.add("Krish");
		strArr.add("ansh");
		strArr.add("Bhummi");
		strArr.add("Athrav");
//		strArr.add()

//		 Count Strings with Specific Prefix
		objOnString.countWithSuffix(strArr);
		
	}

}
