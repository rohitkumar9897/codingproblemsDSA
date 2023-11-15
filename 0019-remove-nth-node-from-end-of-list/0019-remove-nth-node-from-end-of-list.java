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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n>size){
            return null;
        }else if(n==size){
            head=head.next;
            return head;
        }
        size-=n;
        curr=head;
        while(size>1){
            curr=curr.next;
            size--;
        }
        curr.next=curr.next.next;
        return head;
    }
}