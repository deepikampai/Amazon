package com.amazon.assessment;

import java.util.HashMap;
import java.util.Map;

public class EncodingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toEncode = "aabccadcc";
		String encodedString = encode(toEncode);
		System.out.println("Result: "+encodedString);
	}

	private static String encode(String toEncode) {
		// TODO Auto-generated method stub
		if(toEncode == null || toEncode.length() == 0) {
			return " ";
		}
		
		char[] toEncodeArray = toEncode.toCharArray();
		int count = 0;
		char toCompare = toEncodeArray[0];
		char prevChar =0;
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i< toEncodeArray.length; i++ ) {
			
			if(toEncodeArray[i] == toCompare) {
				count++;
			}else {
				sb.append(count).append(toCompare);
				toCompare = toEncodeArray[i];
				count = 1;
			}
			//hm.put(toCompare, count);
			
		}
		sb.append(count).append(toCompare);
//		StringBuilder sb = new StringBuilder();
//		for(Map.Entry<Character, Integer> data: hm.entrySet()){
//			sb = sb.append(data.getValue()).append(data.getKey());
//		}
		return sb.toString();
		
//		for(char c: toEncodeArray) {
//			if(prevChar == 0) {
//				prevChar = c;
////				count =1;
//			}
//			
//			if(c == prevChar) {
//				count++;
//			}
//			else {
//				sb.append(count).append(prevChar);
//				prevChar = c;
//				count =1;
//			}
//		}
//		sb.append(count).append(prevChar);
//		return sb.toString();
	}

}
