package com.te.programs;

class Test10 {
	
	
 }



public class Program4 {

	public static void main(String[] args) {
	   
		String s1 = "madam";
		
		char [] ch = s1.toCharArray();
		
		int n = ch.length;
		int count = 0;
		
		for (int i=0,j=n-1;i<=n/2;i++,j--) {
			
			if (ch[i] != ch[j]) {
				count++;
			}
			
		}
		
	if (count == 0) {
		System.out.println("palindrome");
	} else {
		System.out.println("not palindrome");
	}
	
	}

}
