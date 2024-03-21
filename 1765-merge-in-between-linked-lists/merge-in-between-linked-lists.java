class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null || list2==null) {
            return null;
        }
        ListNode curr = list1;
        ListNode start = list1;
        ListNode end =list1;
        int count = 0;

        while(curr!=null) {
            count++;
            if(count==a) {
                start = curr;
            }
            curr = curr.next;
            if(count==b+1) {
                end = curr;
            }
        }

        curr = list2;
        start.next = list2;
        while(curr.next!=null) {
            curr=curr.next;
        }

        curr.next = end;
        return list1;
    }
}