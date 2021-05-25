package com.jhlee.dabang;

import java.util.Arrays;

public class DaBang {

	public static void main(String[] args) {
		TeaType tea = TeaType.보성녹차;
		System.out.println("JB 다방에 환영합니다.");
		TeaType teaTypes[] = TeaType.values();
		System.out.println(
				Arrays.toString(teaTypes));
	}
}
