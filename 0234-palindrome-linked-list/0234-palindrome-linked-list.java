class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode mid_next=mid.next;
        mid.next=null;
        ListNode temp2=reverseList(mid_next);
        ListNode temp1=head;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
            return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
        
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode h2=null;//step-1
        ListNode temp=head;//step-2
        while(temp!=null){
            head=head.next; //moving head to next node
            temp.next=h2;//head node become null using temp
            h2=temp;
            temp=head;
        }
        return h2;
    }
}