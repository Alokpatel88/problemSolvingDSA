package com.JavaDsaQuestions.problemSolvingDSA.Collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filters {
	
	private void evenOdd(ArrayList<Integer> nums) {
		ArrayList<Integer> evenlist = nums.stream().filter(n -> (n % 2 == 0))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Even Filter List is - " + evenlist.toString());
	}
	
	private void oddList(ArrayList<Integer> nums) {
		ArrayList<Integer> oddList = nums.stream().filter(n -> n % 2 != 0)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("oddList - " + oddList.toString());
		
	}
	
	// find Maximum element
	private void finMaxElement(ArrayList<Integer> nums) {
		// TODO Auto-generated method stub
		int maxi = Integer.MIN_VALUE;
		for(int i = 0; i< nums.size(); i++) {
			if(maxi < nums.get(i)) {
				maxi = nums.get(i);
			}
		}
		System.out.println("Max number is - " + maxi);
		
		// With Stream
		int maxNumber = nums.stream().max(Integer::compare).orElseThrow();
		System.out.println(maxNumber);
	}
	
//  Sort a List
	private void sortList(ArrayList<Integer> nums) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sortList = nums.stream().sorted()
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Sorted List" + sortList);
		
	}
//  Sort a List - in reverse Order - .sorted(Comparator.reverseOrder())
	private void sortInReverse(ArrayList<Integer> nums) {
		ArrayList<Integer> desSort = nums.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("reverseSorting desSort - " + desSort.toString());
		
	}
	
	
	public static void main(String []args) {
		Filters filterObj = new Filters();
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(90);
		// inex 1 se sare element isme inset karega
		nums.addAll(1, nums);
		nums.add(100);
		System.out.println(nums);
//		nums.addAll(Arrays.asList(12, 22, 11, -1, -3, -92, 77));
		// filter OddEven Numbers from List
		
		filterObj.evenOdd(nums);
		filterObj.oddList(nums);
		
		//Find Maximum in list
		filterObj.finMaxElement(nums);
		//  Sort a List
		filterObj.sortList(nums);
		// sortInReverse
		filterObj.sortInReverse(nums);
		
	}
}
