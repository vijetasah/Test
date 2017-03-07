package BalancedBrackt;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import GenericDataStructures.Stack;
public class BalancedBrackets {
	static final String LEFT_BIG_BRAC="[";
	static final String RIGHT_BIG_BRAC="]";
	static final String LEFT_SMALL_BRAC="(";
	static final String RIGHT_SMALL_BRAC=")";
	static final String LEFT_CURLEY_BRAC="{";
	static final String RIGHT_CURLEY_BRAC="}";
    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	       // Stack<char> it = new Stack<>()
	        Stack<String> inp = new Stack<>();
	        String[] arr = new String[t];
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            arr[a0]=s;
	            }
	        System.out.println(arr[0]+arr[1]);
	        for(int a0 = 0; a0 < t; a0++){
	            String s=arr[a0];
	            System.out.println("Element: "+s);
	           
	            		if(s.equals(LEFT_BIG_BRAC)||s.equals(LEFT_CURLEY_BRAC)||s.equals(LEFT_SMALL_BRAC)){
	            			System.out.println("PUSHING");
	            			inp.push(s);
	            			System.out.println("PUSHED");
	            		}
	            		else{
	            			if(s.equals(RIGHT_BIG_BRAC)){
	            				if(a0==0){System.out.println("NO"); break;}
	            				else{if(!(inp.pop().equals(LEFT_BIG_BRAC))){
	            					System.out.println("NO");
	            					break;
	            					}}
	            			}
	            			else if(s.equals(RIGHT_CURLEY_BRAC)){
	            				if(a0==0){System.out.println("NO"); break;}
	            				else{if(inp.pop().equals(LEFT_CURLEY_BRAC)){continue;}
	            				else{
	            					System.out.println("NO");
	            					break;
	            					}}
	            			}
	            			else if(s.equals(RIGHT_SMALL_BRAC)){
	            				if(a0==0){System.out.println("NO"); break;}
	            				else{if(inp.pop().equals(LEFT_SMALL_BRAC)){continue;}
	            				else{
	            					System.out.println("NO");
	            					break;
	            					}
	            			}}

	            	}
	
	            }
    		System.out.println("YES");         
	        }
		
	    }

	


