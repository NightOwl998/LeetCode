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
    public ListNode oddEvenList(ListNode head) {       
        
        if(head==null) return null; //Empty liste
        if(head.next==null) return head; // a liste that only contains one element.
        ListNode temp_odd=new ListNode(head.val,null); //if we got here it means we have at least two elements in the list and so the odd list and the even list contains at least one element and they are not empty. 
        ListNode temp_even=new ListNode((head.next).val,null);
        ListNode list_odd=temp_odd;
        ListNode list_even=temp_even;
        ListNode copy_=(head.next).next;
        int counter=1;
        while(copy_!=null)
        {   
            
            if(counter%2!=0) 
            {
                ListNode el=new ListNode(copy_.val,null);
                temp_odd.next=el;
                temp_odd=temp_odd.next;
               
            }
            else
            { 
                ListNode el=new ListNode(copy_.val,null);
                
                temp_even.next=el;
                temp_even=temp_even.next;
            }
            
            
            copy_=copy_.next;
            counter++;
        }
        
        
        temp_odd.next=list_even;
        return list_odd;

    }
}