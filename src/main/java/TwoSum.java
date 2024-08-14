
//Q.
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = new int[] {2,7,11,15};
		int nums2[] = new int[] {3,2,4};
		
		int[] ls1 = twoSum(nums1, 9);
		List<Integer> list1 = Arrays.stream(ls1).boxed().collect(Collectors.toList());
		System.out.println(list1);
		
		int[] ls2 = twoSum(nums2, 6);
		List<Integer> list2 = Arrays.stream(ls2).boxed().collect(Collectors.toList());
		System.out.println(list2);

	}
	
	public static int[] twoSum(int[] nums, int target) {
		List<Integer> list= new ArrayList<Integer>();
		for(int i = 0 ; i<nums.length; i++) {
			
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					list.add(i);
					list.add(j);
					
				}
			}
		}

		return list.stream().mapToInt(i->i).toArray();
        
    }

}
