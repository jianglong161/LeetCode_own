/**
 * Created by Still2Almost on 2017/4/17.
 */
public class DeleteNodeinALinkedList {
    public void deleteNode(ListNode node){
        if(node.next==null)
            return;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
