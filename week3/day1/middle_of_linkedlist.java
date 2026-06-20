package week3.day1;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}
class Solution {
    public static ListNode middleNode(ListNode head) {
       
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null&&fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       return slow;
    }
}
