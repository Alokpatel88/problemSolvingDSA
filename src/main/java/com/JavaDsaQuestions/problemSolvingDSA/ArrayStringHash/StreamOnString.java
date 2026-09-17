package com.JavaDsaQuestions.problemSolvingDSA.ArrayStringHash;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
	
	private void nonRepeatChar(String str) {
		// TODO Auto-generated method stub
		String lowerCaseStr = str.toLowerCase();
		HashMap<Character, Integer> mp = new HashMap<>();
//		key -> value, a = 2, g = 2, c=1, m = 2, o/p = c
		for(int i = 0; i<str.length(); i++) {
			mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0) +1);	
		}
		System.err.println("for visual log change - red color");
		System.out.println("Printing map data - " + mp.toString());
		// traverse on map and return result
		int step = 0;
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			entry.getValue();
			System.out.println("Step - " + step++ +  ", Curr Key" + entry.getKey() + "Curr value is : " + entry.getValue());
		}
	}
	
	public static void main(String []args) {
		StreamOnString objStreamOnString = new StreamOnString();
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
		objStreamOnString.countWithSuffix(strArr);
		
		//Find First Non-Repeated Character in a String
		String str = "Alokaaa";
		objStreamOnString.nonRepeatChar(str);
		
	}

}
