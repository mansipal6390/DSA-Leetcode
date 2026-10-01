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
        
        // ListNode A = headA;

        // while(A!=null){
        //     ListNode B = headB;
        //     while(B != null){
        //         if(A==B){                                      // broute forece code 
        //             return B;
        //         }
        //         B = B.next;
        //     }
        //      A = A.next;
        // }
        // return null;


        ListNode A = headA;

        ListNode B = headB ;

        while(A!=B){
            if(A==null){
                A = headB;
            }else{
                A = A.next;
            }
            if(B==null){
                B = headA;
            }else{
                B = B.next;
            }

           
        }
         if(A==B){
                return B;
            }
        return null;
    }
}