package com.loops.foreach;

import java.util.HashSet;
import java.util.Set;

public class Nonrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Programming";
		
		Set<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			
			if(set.contains(ch)) {
				System.out.println("Non repetive character: " + ch);
				break;
			}
			
			set.add(ch);
				
			}
		}

	}

