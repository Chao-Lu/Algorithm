/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 
        ListNode l = new ListNode(0);
        ListNode p = l;
        int pre_carr = 0;
        while(l1 != null && l2 != null){
            int present_val = pre_carr + l1.val + l2.val;
            l.next = new ListNode((present_val%10));
            pre_carr = present_val / 10;
            
            l1 = l1.next;
            l2 = l2.next;
            l = l.next;
        }
        while(l1 != null){
            int present_val = pre_carr + l1.val;
            l.next = new ListNode((present_val%10));
            pre_carr = present_val / 10;
            l1 = l1.next;
            l = l.next;
        }
        while(l2 != null){
            int present_val = pre_carr + l2.val;
            l.next = new ListNode((present_val%10));
            pre_carr = present_val / 10;
            l2 = l2.next;
            l = l.next;
        }
        if(pre_carr != 0){
            l.next = new ListNode(pre_carr);
        }
        return p.next;
        
    }
}