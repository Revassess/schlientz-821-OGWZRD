package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
    	int sl = s1.length();
    	if(sl != s2.length())return false;
    	for(int i = 0;i<sl;i++)
    		if(s1.charAt(i)!=s2.charAt(i))return false;
    	return true;
    		}
}