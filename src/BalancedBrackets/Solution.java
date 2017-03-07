package BalancedBrackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static final char LEFT_BIG_BRAC='[';
	static final char RIGHT_BIG_BRAC=']';
	static final char LEFT_SMALL_BRAC='(';
	static final char RIGHT_SMALL_BRAC=')';
	static final char LEFT_CURLEY_BRAC='{';
	static final char RIGHT_CURLEY_BRAC='}';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<String> inpList = new ArrayList<String>();
        for(int a0 = 0; a0 < t; a0++){
        	inpList.add(in.next());
        }
        for(String s: inpList){
        	Boolean b =checkIfBalanced(s);
        	if(b==true){
        		System.out.println("YES");
        	}
        	else{
        		System.out.println("NO");
        	}
        }
    }

	private static Boolean checkIfBalanced(String s) {
		// TODO Auto-generated method stub
		char arr[]=s.toCharArray();
		Stack<Character> st= new Stack<>();
		for(char c: arr){
			switch (c){
				case LEFT_BIG_BRAC:System.out.println("a1"); st.push(c);break;
				case LEFT_CURLEY_BRAC: System.out.println("a2");st.push(c);break;
				case LEFT_SMALL_BRAC:System.out.println("a3"); st.push(c);break;
				case RIGHT_BIG_BRAC: 	if(st.isEmpty()){System.out.println("e1");return false;}
										else{
											if(!(st.pop()==LEFT_BIG_BRAC)){System.out.println("e2");return false;}
										}
										break;
				case RIGHT_CURLEY_BRAC: 	if(st.isEmpty()){System.out.println("e3");return false;}
				else{
					if(!(st.pop()==LEFT_CURLEY_BRAC)){System.out.println("e4");return false;}
				}
				break;
				case RIGHT_SMALL_BRAC: 	if(st.isEmpty()){System.out.println("e5");return false;}
				else{
					if(!(st.pop()==LEFT_SMALL_BRAC)){System.out.println("e6");return false;}
				}
				break;
			}
		}
		return st.isEmpty();
	}
}
