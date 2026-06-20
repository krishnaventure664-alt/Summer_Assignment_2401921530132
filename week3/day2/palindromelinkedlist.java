package week3.day2;
class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
            this.next = null;
        }

    }
    public static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&& fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newNode = reverse(slow.next);

        ListNode first = head;
        ListNode second = newNode;

        while(second!=null){
            if(first.val!=second.val){
                reverse(newNode);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newNode);
        return true;
    }
}