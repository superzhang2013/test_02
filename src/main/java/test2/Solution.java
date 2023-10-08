package test2;

/**
 * Created by zhanghong on 2023/8/28.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum1 = getNodeResult(l1);
        long sum2 = getNodeResult(l2);
        long result = sum1 + sum2;

        return getListNodeByInt(result);
    }

    public static long getNodeResult(ListNode listNode){
        long result = listNode.val;
        long multi = 1L;
        while(listNode.next!=null){
            listNode = listNode.next;
            multi = multi*10;
            result += listNode.val*multi;
        }

        return result;
    }

    public static ListNode getListNodeByInt(long result){
        ListNode resultNode = new ListNode();

        ListNode pointNode = resultNode;
        resultNode.val = (int) (result %10);
        if(result/10>0){
            resultNode.next = pointNode;
        }


        while((result = (result/10))>0){
            ListNode tempInfoNode = new ListNode();
            pointNode.next = tempInfoNode;
            pointNode = tempInfoNode;
            pointNode.val = (int) (result %10);

        }


        return resultNode;
    }
}
