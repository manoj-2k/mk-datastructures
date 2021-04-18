package com.mk.sb.algos.numbers.easy;

//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//LC-7
public class ReverseInteger {

	public static void main(String[] args) {		
	   System.out.println(reverse(123));
	   System.out.println(reverse(-123));
	   System.out.println(reverse(-12300));
	   System.out.println(reverse(1534236469));

	}
	 public static int reverse(int x) {		 
		 boolean isNve = false;
		 if(x<0) {
			 isNve = true;
			 x = -x;
		 }
		 long y = 0;
		 while(x >= 10) {
			 y = y*10 + x%10;
			 x = x/10;			 
		 }		 
		 y = y*10+x;
		 if(isNve) y = -y;
		 if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) return 0;
		 return (int)y;
	    }
	 

}
