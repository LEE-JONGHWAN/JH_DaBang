package com.jhlee.dabang;

import java.util.Arrays;

public class DaBang {

	public static void main(String[] args) {
		TeaType tea = TeaType.보성녹차;
		System.out.println("JB 다방에 환영합니다.");
		TeaType teaTypes[] = TeaType.values();
		/**
		 * 나중에 Enum to List 사용하여 깔끔하게 정리
		 */
		String menu = String.join("/", 
				TeaType.감잎차.toString(),
				TeaType.보성녹차.toString(),
				TeaType.율무차.toString());
		
		System.out.println(menu);
		String[] menus = menu.split("/");
		return ;
	}
}
