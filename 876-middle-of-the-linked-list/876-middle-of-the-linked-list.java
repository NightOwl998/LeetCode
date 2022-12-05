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
        //get the length of the LinkedList
        while(node!=null)
        {
            node=node.next;
            length++;
        }
        // calculate the index of the middle element 
        int middle=length/2+1;       
        int counter=1;
        
        while(counter!=middle)
        {  
            counter++;
            head=head.next;         
            
        }
        return head;
    }
}