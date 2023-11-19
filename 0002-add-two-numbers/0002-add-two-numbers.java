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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        ListNode curr1=l1;
        ListNode curr2=l2;
        int carry=0;
        while(curr1!=null||curr2!=null){
            int x=(curr1!=null)? curr1.val:0;
            int y=(curr2!=null)? curr2.val:0;
            if(x+y+carry>=10){
                temp.next=new ListNode((x+y+carry)%10);
                carry=1;
            }else{
                temp.next=new ListNode(x+y+carry);
                carry=0;
            }
            temp=temp.next;
            if(curr1!=null){
                curr1=curr1.next;
            }
            if(curr2!=null){
                curr2=curr2.next;
            }
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return ans.next;
    }
}