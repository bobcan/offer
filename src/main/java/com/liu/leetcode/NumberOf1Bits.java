package com.liu.leetcode;

public class NumberOf1Bits {
	/**
	 * n 超出Interger范围时 也要进行计算。无符号 的应该转化成long类型的
	 * */
	public static int hammingWeight(int n) {
		int number = 0;
		long nn = n & 0xFFFFFFFFL;
		long flag ;
		while(nn != 0 && nn!= 1){
			flag = nn% 2L;
			if (flag ==1L) {
				number++;
			}
			nn = nn/2L;
		}
		if (nn ==1) {
			number++;
		}
		return number;
	}
}
