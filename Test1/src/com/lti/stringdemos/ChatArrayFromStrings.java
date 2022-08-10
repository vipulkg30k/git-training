package com.lti.stringdemos;

import java.util.*;

public class ChatArrayFromStrings {
	public static void main(String args[]) {
		String ch[] = {"ranchi","jaipur","jodhpur","Delhi", "Mumbai", "Banglore"};
//		if(ch.length<=5) {
//			for(int i=0; i<ch.length; i++) {
//				System.out.println(ch[i].toUpperCase());
//			}
			Arrays.sort(ch);
			for(String str: ch) {
				System.out.println(str);
			}
			try {
				System.out.println("Inside try");
			}
			finally {
				System.out.println("Finally.....");
			}
//		}
//		else {
//			System.out.println("Length should be less than 5");
//		}
	}
}
