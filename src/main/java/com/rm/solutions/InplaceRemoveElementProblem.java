package com.rm.solutions;

/**
 * 
 Given an array and a value, remove all instances of that value in-place and return the new length.
 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
  
 Example:
 Given nums = [3,2,2,3], val = 3,
 Your function should return length = 2, with the first two elements of nums being 2.
 *
 */
public class InplaceRemoveElementProblem 
{
    public static void main( String[] args )
    {
    	InplaceRemoveElementProblem myclass = new InplaceRemoveElementProblem();
    	int[] input = new int[]{3,2,2,3};
    	System.out.println(myclass.removeElement(input, 3));
    	for(int i: input) {
    		System.out.print("value:"+ i);
    		
    	}
    }
    
    //brute force
    //O(n^2)
    public int removeElement(int[] nums, int val) {
    	int newLength = nums.length;
    	
    	for(int i = 0; i< newLength; i++) {
    		if(nums[i] == val) {
    			nums = shiftleft(nums, i, newLength);
    			newLength--;
    			i--;
    		}
    	}
    	
    	return newLength;
    }
    
    public int[] shiftleft(int[] arr, int index, int size) {
    	
    	for(int i = index; i< size - 1; i++) {
    		arr[i] = arr[i+1];
    	}
    	
    	arr[size -1] = 0;    	
    	return arr;
    }
}
