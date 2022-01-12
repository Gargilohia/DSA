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
        
        
        if(head==null || head.next == null)
            return head;
        
        Set<Integer> s = new HashSet<>();
        s.add(head.val);
        ListNode sorted = head;
        ListNode prev= head;
       
        while(prev!=null && prev.next!=null){
            
            head = prev.next;
            if(s.contains(head.val)){
                while(head!=null && s.contains(head.val))
                    head = head.next;
                prev.next = head;
            }
            if(head!=null)
                s.add(head.val);
            prev = prev.next;
            
        }
        return sorted;
    }
}