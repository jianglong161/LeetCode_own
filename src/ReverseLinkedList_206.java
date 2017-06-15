/**
 * Created by Still2Almost on 2017/6/15.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }

}
public class ReverseLinkedList_206 {
    public ListNode reverseLinkeList(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return  prev;
    }
}
