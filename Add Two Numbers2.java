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
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 =l2.next;
        }
        while(!s1.empty() && !s2.empty()){
            int num = s1.peek() + s2.peek();
            int rst = s.peek() + num;
            s.pop();
            s1.pop(); 
            s2.pop();
            s.push(rst%10);
            s.push(rst/10);
        }
        while(!s1.empty()){
            int rst = s.peek() + s1.peek();
            s.pop();
            s1.pop();
            s.push(rst%10);
            s.push(rst/10);
        }
        while(!s2.empty()){
            int rst = s.peek() + s2.peek();
            s.pop();
            s2.pop();
            s.push(rst%10);
            s.push(rst/10);
        }
        if(s.peek() == 0)
            s.pop();
        ListNode l = new ListNode(0);
        ListNode p = l;
        while(!s.empty()){
            l.next = new ListNode(s.peek());
            s.pop();
            l = l.next;
        }
        return p.next;
    }
}