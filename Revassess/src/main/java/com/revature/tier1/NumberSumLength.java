package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String s = Long.toString(num);
		long p = Integer.toUnsignedLong(s.length());
		long l = 0;
		long t2 =0;
		long t = 0;
		for(int i = 0;i<p;i++) {
		t = Long.parseLong(Character.toString(s.charAt(i)));
		t2 = t;
		for(long j = 1;j<p;j++)t2 *= t;
		l+=t2;
		}
		if(l == num)return true;
		return false;
	}
}
