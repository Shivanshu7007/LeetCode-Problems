public class Solution {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null) return;
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        ListNode ptr=head;
        while (ptr!=null) {
            stack.push(ptr); ptr=ptr.next;
        }
        int cnt=(stack.size()-1)/2;
        ptr=head;
        while (cnt-->0) {
            ListNode top = stack.pop();
            ListNode tmp = ptr.next;
            ptr.next=top;
            top.next=tmp;
            ptr=tmp;
        }
        stack.pop().next=null;
    }
}