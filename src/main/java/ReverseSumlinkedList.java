import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListNode {
	int val;
	// List<String> ls = new Arr
	ListNode next;

	ListNode() {

	}

	ListNode(int val) {
		this.val = val;
	}

}

public class ReverseSumlinkedList {

	public static void main(String[] args) {

//		ListNode l1 = new ListNode(2);
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(3);
//
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);

//		ListNode l1 = new ListNode(9);
//		l1.next = new ListNode(9);
//		l1.next.next = new ListNode(9);
//		l1.next.next.next = new ListNode(9);
//		l1.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next = new ListNode(9);
//
//		ListNode l2 = new ListNode(9);
//		l2.next = new ListNode(9);
//		l2.next.next = new ListNode(9);
//		l2.next.next.next = new ListNode(9);
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(9);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		l2.next.next.next = new ListNode(9);

		ListNode l3 = addTwoNumbers(l1, l2);
		ListNode current = l3;

		while (current != null) {
			// System.out.println(current.val);

			current = current.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// l1.next = l2;
		List<Integer> ls1 = new ArrayList<Integer>();
		List<Integer> ls2 = new ArrayList<Integer>();
		
		ListNode current1 = l1;
		ListNode current2 = l2;

		while (current1 != null) {
			
			ls1.add(current1.val);
			current1 = current1.next;
		}

		while (current2 != null) {
			
			ls2.add(current2.val);
			current2 = current2.next;
		}

		Collections.reverse(ls1);
		Collections.reverse(ls2);
		
		

		int diffsize = 0;
		
		if (ls1.size() < ls2.size()) {
			 
			 diffsize = ls2.size() - ls1.size();
			 
			 for (int i = 0; i < diffsize; i++) {
					ls1.add(i, 0);
				}
		}
		
		
		if (ls2.size() < ls1.size()) {
			diffsize = ls1.size() - ls2.size();
			
			for (int i = 0; i < diffsize; i++) {
				ls2.add(i, 0);
			}
			
		}
		

		List<Integer> result = new ArrayList<>();
		int size = Math.min(ls1.size(), ls2.size());
		

		for (int i = 0; i < size; i++) {
			result.add(ls1.get(i) + ls2.get(i));
		}

		
		// Handle cases where lists are of different sizes
		if (ls1.size() > size) {
			for (int i = size; i < ls1.size(); i++) {
				result.add(ls1.get(i));
			}
		}
		

		if (ls2.size() > size) {
			for (int i = size; i < ls2.size(); i++) {
				result.add(ls2.get(i));
			}
		}


		List<Integer> result1 = new ArrayList<>();
		int carry = 0;

		// Traverse from the end to handle carry
		for (int i = result.size() - 1; i >= 0; i--) {
			int current = result.get(i) + carry;

			if (current >= 10) {
				carry = current / 10;
				current = current % 10;
			} else {
				carry = 0;
			}

			result1.add(current);
		}
		

		// Add any remaining carry
		if (carry > 0) {
			result1.add(carry);
		}

		
		// Reverse the result to maintain the original order
		List<Integer> finalResult = new ArrayList<>();
		for (int i = result1.size() - 1; i >= 0; i--) {
			finalResult.add(result1.get(i));
		}
		Collections.reverse(finalResult);
		

		// System.out.println(finalResult);

		ListNode dummyHead = new ListNode(0); // Create a dummy head node
		ListNode currents = dummyHead; // Pointer to build the list

		for (int value : finalResult) {
			currents.next = new ListNode(value); // Create a new node with the current value
			currents = currents.next; // Move to the next node
		}

		return dummyHead.next;

		// return null;

	}

}
