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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int count= k;
        ListNode curr=head;
        ListNode next=head;
        ListNode ans=null;
        ListNode temp2=new ListNode(0);
        int arr[]=new int[k];
        while(curr!=null&&count!=0){
            curr=curr.next;
            count--;
            if(count==0){
                curr=next;
                count=k;
                for(int i=0; i<k; i++){
                    arr[i]=curr.val;
                    curr=curr.next;
                }
                for(int i=k-1; i>=0; i--){
                    temp2.next=new ListNode(arr[i]);
                    if(ans==null){
                        ans=temp2;
                    }
                    temp2=temp2.next;
                }
                next=curr;
            }
        }
        temp2.next=next;
        return ans.next;

    }
}