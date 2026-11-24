package com.javacodingjourney.strings;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" ";
		int sum=1;
		int CountMax=1;
		HashSet<Character> hs=new HashSet<>();
		
		if(!s.isEmpty())
		{
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
			for(int j=i+1;j<s.length();j++)
			{
				
				if(!hs.contains(s.charAt(j)))
				{
					hs.add(s.charAt(j));
					sum=sum+1;
					if(sum>CountMax)
					{
						CountMax=sum;
					}
				}
				else
				{
					break;
				}
			}
			sum=1;
			hs.clear();
			
		}
		
		System.out.print(CountMax);
		}
		else
		{
			System.out.print("Empty String.");
		}

	}

}
