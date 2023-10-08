package test2;

/**
 * Created by zhanghong on 2023/8/28.
 */
public class ListNode {

    int val;

    ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val =val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
