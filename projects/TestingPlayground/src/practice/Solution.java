package practice;

/**
 * Definition for singly-linked list.
 */

class Solution {
	public static void main(String[] args) {
		ListNode node = new ListNode(123);
		ListNode node1 = new ListNode(234);

//		System.out.print(addTwoNumbers(node, node1));
		System.out.println(node.val + node1.val);

	}
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//		return l1.val;
//
//	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}