package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode aa = mergeTwoLists(list1, list2);
//		printOutNode(aa);
    }
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		//if(list1 == null) return list2;
		//if(list2 == null) return list1;
		ListNode tmpList = list1.next;
		list1.next = list2;
		list2.next.next.next = tmpList;
//		printOutNode(list1.next.next);
		printOutNode(list1);
//		ListNode newList = new ListNode();
//		while(list1!=null || list2!=null){
//			
//			collect(newList, getSmallOne(list1, list2));
//		}
		//list2 = list2.next;
		return list1;
	}
	public static void collect(ListNode newList, ListNode targetList){
		newList.next = targetList;
		targetList = targetList.next;
		printOutNode(newList);
		printOutNode(targetList);
	}
	
	public static ListNode getSmallOne(ListNode list1, ListNode list2){
		System.out.println("getSmallOne");
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		if(list1.val>=list2.val) {
			return list2;
		}
		return list1;
	}
	public static class ListNode {
		    int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    
	public  static void printOutNode(ListNode node){
		do{
			System.out.println(node.val);
			node = node.next;
		}
		while(node!=null);
	}

}
