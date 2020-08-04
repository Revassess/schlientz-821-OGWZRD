package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if( arr == null ||arr.length == 0 )return 0;
		int s = 0;
		for(int i : arr)
			s+=i;
		return s;
		
		
	}
}
