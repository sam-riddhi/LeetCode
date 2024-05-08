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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<Integer>(); 
        ListNode temp = head;
        boolean ispalin = true;
        while(temp != null)
        {
            s.push(temp.val);
            temp = temp.next;
        }
        while(head != null)
        {
            int i = s.pop();
            if(head.val == i)
            {
                ispalin = true;
            }
            else
            {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
}
