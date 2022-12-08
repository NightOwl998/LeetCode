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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        List<ListNode> list=new ArrayList<>();
        //craete a new listNOde and copy only. 
        ListNode res=new ListNode(head.val,null);
        ListNode result=res;
        ListNode copy_=head;
        while(copy_!=null)
        {
            if(res.val!=copy_.val) 
            {              
            ListNode el=new ListNode(copy_.val,null);
            res.next=el;
            res=res.next;
            }
            copy_=copy_.next;
        }
       
         return result;
    }
}