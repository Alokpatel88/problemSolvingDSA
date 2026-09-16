package com.JavaDsaQuestions.problemSolvingDSA.Collections;

import java.util.ArrayList;
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
	
	public static void main(String []args) {
		Filters filterObj = new Filters();
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(22);
		nums.add(11);
		nums.add(-1);
		nums.add(-3);
		nums.add(-92);
		nums.add(77);
		// filter OddEven Numbers from List
		filterObj.evenOdd(nums);
		filterObj.oddList(nums);
		
		//Find Maximum in list
		filterObj.finMaxElement(nums);
	}
}
