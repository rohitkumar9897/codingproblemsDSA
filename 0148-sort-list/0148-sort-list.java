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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        int arr[]=new int[size];
        curr=head;
        for(int i=0; i<size; i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        Arrays.sort(arr);
        ListNode temp=new ListNode(arr[0]);
        curr=temp;
        for(int i=1; i<size; i++){
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
        }
        return temp;
    }
}