/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution{
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode current = head.next; 
        ListNode oddTail = head;
        while(current!=null && current.next!=null) {
            ListNode nextOdd = current.next; 
            current.next = nextOdd.next; 
            ListNode evenHead = oddTail.next;
            oddTail.next = nextOdd;
            nextOdd.next = evenHead;
            oddTail = oddTail.next;
            current = current.next;
        }
        return head;
    }
}
