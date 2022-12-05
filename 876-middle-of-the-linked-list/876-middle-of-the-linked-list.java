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
    public ListNode middleNode(ListNode head) {
        ListNode node=head;
        int length=0;
        
        while(node!=null)
        {
            node=node.next;
            length++;
        }
        
        int compt=length/2+1;
       // System.out.println("the legth is "+length+"thr compt is"+ compt);
        int h=1;
        while(h!=compt)
        {  
            h++;
            head=head.next;
            
            
            
        }
        return head;
    }
}