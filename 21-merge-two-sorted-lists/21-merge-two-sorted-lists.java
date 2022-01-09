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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2==null)
            return list1;
        
        ListNode mergedfinal;
        ListNode point;
        ListNode merged;
        
        if(list2.val<list1.val){
            merged = list2;
            point = list1;
            mergedfinal = merged;
        }
        else {
            merged = list1;
            point = list2;
            mergedfinal = merged;
        }
        
        
        while(point!= null){
            
            if(merged.next==null || point.val<merged.next.val|| point.val==merged.val){
                ListNode temp2 = point.next;
                ListNode temp = merged.next;
                merged.next = point;
                merged.next.next = temp;
                point = temp2;
            }
            merged = merged.next;
        }
        
        return mergedfinal;
    }
}