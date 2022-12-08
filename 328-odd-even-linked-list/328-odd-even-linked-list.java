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
        
        
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp_odd=new ListNode(head.val,null);
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
                //System.out.println("the odd list is "+el.val);
            }
            else
            { 
                ListNode el=new ListNode(copy_.val,null);
                //System.out.println("the even  list is "+el.val);
                temp_even.next=el;
                temp_even=temp_even.next;
            }
            
            
            copy_=copy_.next;
            counter++;
        }
         //System.out.println("the last element on the odd "+temp_odd.val);
        
        temp_odd.next=list_even;
        return list_odd;

    }
}