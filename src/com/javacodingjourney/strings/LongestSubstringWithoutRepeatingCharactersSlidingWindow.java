package com.javacodingjourney.strings;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharactersSlidingWindow {
	
	// APPROACH: Sliding Window + HashSet

	// left -> Points to the starting index of the current window.
	// right -> Points to the ending index / character currently being processed.

	// 1. Initially, add the first character to the HashSet.
	// 2. Move the right pointer through the string one character at a time.

	// 3. Check whether the current character (right index) already exists in the
	// HashSet.

	// 4. If the character is NOT present:
//	    - Add the character to the HashSet.
//	    - Calculate the current window length: right - left + 1.
//	    - Update the maximum length if the current window is longer.
//	    - Move the right pointer forward.

	// 5. If the character is ALREADY present (duplicate):
//	    - Use a while loop to remove characters from the left side.
//	    - Remove the character at the left index from the HashSet.
//	    - Move the left pointer forward.
//	    - Continue until the duplicate character is no longer present.
//	    - The right pointer stays at the same position because the
//	      current character has not yet been added to the HashSet.

	// 6. Once the duplicate is removed, the next iteration adds the
//	    current character and expands the window.

	// 7. The maximum window length represents the longest substring
//	    without repeating characters.

	// TIME COMPLEXITY: O(n)
	// Each character is added and removed from the HashSet at most once.

	// SPACE COMPLEXITY: O(n)
	// The HashSet stores characters from the current window.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		HashSet<Character> hs=new HashSet<>();
		
		int left=0;
		int right=1;
		int count=1;
		int countMax=1;
		if(s.length()>0)
		{
		hs.add(s.charAt(0));
		
		int y=s.length();
		while(right<y)
		{
			if(!hs.contains(s.charAt(right)))
			{
				hs.add(s.charAt(right));
				count=right-left+1;
				right++;
				if(count>countMax)
				{
					countMax=count;
				}
							
			}
			else
			{
				while(hs.contains(s.charAt(right)))
				{
				hs.remove(s.charAt(left));
				left++;
				}
				
			}

		}
		
		System.out.print(countMax);
		}
		else
		{
			System.out.print(left);
		}

	}


}
