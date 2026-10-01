/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode A = headA;

        while(A!=null){
            ListNode B = headB;
            while(B != null){
                if(A==B){
                    return B;
                }
                B = B.next;
            }
             A = A.next;
        }
        return null;
    }
}