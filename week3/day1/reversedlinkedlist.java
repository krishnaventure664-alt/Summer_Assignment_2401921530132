package week3.day1;

class Solution {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
            this.next = null;
        }
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp  = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}